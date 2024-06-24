package com.example.board.model;

public class FollowerModel {
    private int followerId; // 팔로우를 하는 사용자의 ID
    private int userId; // 팔로우 받는 사용자의 ID

    public FollowerModel() {
    }

    public FollowerModel(int followerId, int userId) {
        this.followerId = followerId;
        this.userId = userId;
    }

    // Getter and Setter methods
    public int getFollowerId() {
        return followerId;
    }

    public void setFollowerId(int followerId) {
        this.followerId = followerId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}