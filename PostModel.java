package com.example.board.model;

public class PostModel {
    private int postId;
    private int userId; // 게시물 작성자의 ID
    private String title;
    private String content;
    private String fileName;

    public PostModel() {
    }

    public PostModel(int postId, int userId, String title, String content, String fileName) {
        this.postId = postId;
        this.userId = userId;
        this.title = title;
        this.content = content;
        this.fileName = fileName;
    }

    // Getter and Setter methods
    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}