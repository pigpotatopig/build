package com.example.board.controller;

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
public class CommentController {

    // 댓글 작성 기능
    @PostMapping("/writeComment")
    public String writeComment(@RequestParam("postId") int postId, @RequestParam("content") String content) {
        // 댓글 작성 처리 로직
        // 예시로 출력만 하도록 함
        System.out.println("댓글 작성 완료: " + content);
        return "redirect:/board";
    }

    // 댓글 삭제 기능
    @GetMapping("/deleteComment")
    public String deleteComment(@RequestParam("commentId") int commentId) {
        // 댓글 삭제 처리 로직
        // 예시로 출력만 하도록 함
        System.out.println("댓글 삭제 완료: ID " + commentId);
        return "redirect:/board";
    }
}