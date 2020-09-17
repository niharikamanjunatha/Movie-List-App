package com.example.movieapp;

public class Word {
    private String imageUrl;
    private String name;

    public Word(String imageUrl, String name)
    {
        this.imageUrl = imageUrl;
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setImageUrl(String ImageUrl) { this.imageUrl=imageUrl;}

    public void setName(String name) {
        this.name = name;
    }
}
