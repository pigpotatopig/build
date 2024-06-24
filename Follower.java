package com.example.board.model;
public class Follower {
    private int id;
    private int userId;
    private int followerId;

    public Follower(int id, int userId, int followerId) {
        this.id = id;
        this.userId = userId;
        this.followerId = followerId;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getFollowerId() {
        return followerId;
    }

    public void setFollowerId(int followerId) {
        this.followerId = followerId;
    }
}
