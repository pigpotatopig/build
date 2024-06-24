package com.example.board.model;

public class CommentModel {
    private int commentId;
    private int postId; // 댓글이 달린 게시물의 ID
    private int userId; // 댓글 작성자의 ID
    private String content;

    public CommentModel() {
    }

    public CommentModel(int commentId, int postId, int userId, String content) {
        this.commentId = commentId;
        this.postId = postId;
        this.userId = userId;
        this.content = content;
    }

    // Getter and Setter methods
    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}