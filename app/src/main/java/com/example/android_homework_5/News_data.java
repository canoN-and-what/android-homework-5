package com.example.android_homework_5;

import androidx.annotation.DrawableRes;

public class News_data {
    private String text;
    private int likes;
    private int comments;
    private int reposts;
    private boolean isLiked = false;
    @DrawableRes
    private int imageResourceId;
    public News_data(String text,int likes, int comments, int reposts, int imageResourceId){
        this.text = text;
        this.likes = likes;
        this.comments = comments;
        this.reposts = reposts;
        this.imageResourceId = imageResourceId;
    }

    public String getText() {
        return text;
    }

    public int getComments() {
        return comments;
    }

    public int getReposts() {
        return reposts;
    }

    public int getLikes() {
        return likes;
    }


    public void setText(String text) {
        this.text = text;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public void setReposts(int reposts) {
        this.reposts = reposts;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
    public boolean isLiked(){
        return isLiked;
    }
    public void like(){
        if(isLiked) likes--;
        else likes++;
        isLiked = !isLiked;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
}
