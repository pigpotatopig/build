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
public class PostController {
    private final String URL = "jdbc:mysql://localhost:3306/boardDB";
    private final String USER = "root";
    private final String PASSWORD = "1234";

    // 글 하트 및 하트 해제 기능
    @PostMapping("/likePost")
    public String likePost(@RequestParam("postId") int postId) {
        // 글 하트 기능 처리 로직
        // 예시로 출력만 하도록 함
        System.out.println("글 하트 기능 실행: ID " + postId);
        return "redirect:/board";
    }

    @PostMapping("/unlikePost")
    public String unlikePost(@RequestParam("postId") int postId) {
        // 글 하트 해제 기능 처리 로직
        // 예시로 출력만 하도록 함
        System.out.println("글 하트 해제 기능 실행: ID " + postId);
        return "redirect:/board";
    }
}