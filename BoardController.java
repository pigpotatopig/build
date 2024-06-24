package com.example.board.controller;

import com.example.board. model.Post;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Controller
public class BoardController {
    private final String URL = "jdbc:mysql://localhost:3306/boardDB";
    private final String USER = "root";
    private final String PASSWORD = "1234";

    // 회원가입 기능
    @GetMapping("/signup")
    public String signupForm() {
        // 사용자 회원가입 폼을 보여줄 뷰 페이지 반환
        return "signup";
    }

    @PostMapping("/signup")
    public String signup(@RequestParam("username") String username, @RequestParam("password") String password) {
        // 사용자 회원가입 처리 로직 작성
        // 예시로 출력만 하도록 함
        System.out.println("회원가입 완료: " + username);
        return "redirect:/login";
    }

    // 로그인 기능
    @GetMapping("/login")
    public String loginForm() {
        // 로그인 폼을 보여줄 뷰 페이지 반환
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
        // 로그인 처리 로직 작성
        // 예시로 출력만 하도록 함
        System.out.println("로그인 성공: " + username);
        return "redirect:/board";
    }

    // 글 작성 기능
    @GetMapping("/writePost")
    public String writePost() {
        // 글 작성 폼을 보여줄 뷰 페이지 반환
        return "writePost";
    }

    @PostMapping("/uploadFile")
    public String uploadFile(@RequestParam("title") String title, @RequestParam("content") String content, @RequestParam("file") MultipartFile file) {
        // 글 작성 처리 로직 작성
        // 예시로 출력만 하도록 함
        System.out.println("글 업로드 완료: " + title);
        return "redirect:/board";
    }

    // 글 수정 기능
    @GetMapping("/editPost")
    public String editPost(@RequestParam("id") int id, Model model) {
        // 글 수정 폼을 보여줄 뷰 페이지 반환
        return "editPost";
    }

    @PostMapping("/updatePost")
    public String updatePost(@RequestParam("id") int id, @RequestParam("title") String title, @RequestParam("content") String content, @RequestParam("newFile") MultipartFile newFile) {
        // 글 수정 처리 로직 작성
        // 예시로 출력만 하도록 함
        System.out.println("글 수정 완료: " + title);
        return "redirect:/board";
    }

    // 글 삭제 기능
    @GetMapping("/deletePost")
    public String deletePost(@RequestParam("id") int id) {
        // 글 삭제 처리 로직 작성
        // 예시로 출력만 하도록 함
        System.out.println("글 삭제 완료: ID " + id);
        return "redirect:/board";
    }

    // 게시판 목록 조회 기능
    @GetMapping("/board")
    public String board(Model model) {
        List<Post> posts = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM posts");
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                Post post = new Post(rs.getInt("id"), rs.getString("title"), rs.getString("content"), rs.getString("file_name"));
                posts.add(post);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        model.addAttribute("posts", posts);
        return "board";
    }

    // 파일 다운로드 기능
    @GetMapping("/downloadFile")
    public void downloadFile(@RequestParam("id") int id, HttpServletResponse response) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement("SELECT file_name FROM posts WHERE id = ?")) {
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    String fileName = rs.getString("file_name");
                    File file = new File("uploads", fileName);
                    if (file.exists()) {
                        response.setContentType("application/octet-stream");
                        response.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
                        try (InputStream inStream = new FileInputStream(file); OutputStream outStream = response.getOutputStream()) {
                            byte[] buffer = new byte[4096];
                            int bytesRead;
                            while ((bytesRead = inStream.read(buffer)) != -1) {
                                outStream.write(buffer, 0, bytesRead);
                            }
                        }
                    }
                }
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}