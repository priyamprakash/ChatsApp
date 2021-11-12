package com.app.chatsapp.Models;

public class User {
    private String uid, name, phoneNumber, profileImage, token;

    public User() {

    }

    public User(String uid, String name, String phoneNumber, String profileImage) {
        this.uid = uid;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.profileImage = profileImage;
    }

}
