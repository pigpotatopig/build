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
public class FollowerController {

    // 팔로워 추가 기능
    @PostMapping("/addFollower")
    public String addFollower(@RequestParam("userId") int userId) {
        // 팔로워 추가 처리 로직
        // 예시로 출력만 하도록 함
        System.out.println("팔로워 추가 완료: 사용자 ID " + userId);
        return "redirect:/user/" + userId;
    }

    // 팔로워 삭제 기능
    @GetMapping("/deleteFollower")
    public String deleteFollower(@RequestParam("followerId") int followerId) {
        // 팔로워 삭제 처리 로직
        // 예시로 출력만 하도록 함
        System.out.println("팔로워 삭제 완료: ID " + followerId);
        return "redirect:/board";
    }

    // 팔로워의 글 보기 기능
    @GetMapping("/followerPosts")
    public String followerPosts(@RequestParam("followerId") int followerId) {
        // 팔로워의 글 조회 처리 로직
        // 예시로 출력만 하도록 함
        System.out.println("팔로워의 글 보기: ID " + followerId);
        return "followerPosts";
    }
}