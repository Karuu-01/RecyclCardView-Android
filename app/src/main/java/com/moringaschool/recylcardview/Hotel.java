package com.moringaschool.recylcardview;

public class Hotel {
    private String name;
    private String category;
    private String description;
    private int rating;

    public Hotel(String name, String category, String description, int rating) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
