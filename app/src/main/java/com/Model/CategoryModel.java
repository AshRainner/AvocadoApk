package com.Model;

public class CategoryModel {
    private String categoryString;
    private int categoryImg;

    public CategoryModel(String categoryString, int categoryImg) {
        this.categoryString = categoryString;
        this.categoryImg = categoryImg;
    }

    public String getCategoryString() {
        return categoryString;
    }

    public void setCategoryString(String categoryString) {
        this.categoryString = categoryString;
    }

    public int getCategoryImg() {
        return categoryImg;
    }

    public void setCategoryImg(int categoryImg) {
        this.categoryImg = categoryImg;
    }
}
