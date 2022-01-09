package com.example.chatapp.Model;

public class User {

    private String id;
    private String userName;
    private String imageURL;

    public User(String id, String userName, String imageURL) {
        this.id = id;
        this.userName = userName;
        this.imageURL = imageURL;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
