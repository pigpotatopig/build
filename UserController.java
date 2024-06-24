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
public class UserController {

    // 팔로워 추가 기능
    @PostMapping("/followUser")
    public String followUser(@RequestParam("userId") int userId) {
        // 팔로워 추가 처리 로직
        // 예시로 출력만 하도록 함
        System.out.println("사용자 팔로우 완료: ID " + userId);
        return "redirect:/user/" + userId;
    }

    // 팔로워 삭제 기능
    @GetMapping("/unfollowUser")
    public String unfollowUser(@RequestParam("userId") int userId) {
        // 팔로워 삭제 처리 로직
        // 예시로 출력만 하도록 함
        System.out.println("사용자 언팔로우 완료: ID " + userId);
        return "redirect:/user/" + userId;
    }
}