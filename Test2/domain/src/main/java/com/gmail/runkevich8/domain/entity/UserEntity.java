package com.gmail.runkevich8.domain.entity;



public class UserEntity {

    private String fullName;
    private String urlImg;
    private int age;
    private boolean sex;
    private String objectId;

    public UserEntity(String fullName, String urlImg, int age, boolean sex, String objectId) {
        this.fullName = fullName;
        this.urlImg = urlImg;
        this.age = age;
        this.sex = sex;
        this.objectId = objectId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }
//
//    public UserEntity(String username, int age, String profileUrl,boolean gender) {
//        this.username = username;
//        this.age = age;
//        this.profileUrl = profileUrl;
//        this.gender = gender;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getProfileUrl() {
//        return profileUrl;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setProfileUrl(String profileUrl) {
//        this.profileUrl = profileUrl;
//    }
//
//    public boolean isGender() {
//        return gender;
//    }
//
//    public void setGender(boolean gender) {
//        this.gender = gender;
//    }
}
