package com.example.shopulse.Model;

public class CategoryItem
{
    public String title, image;

    public CategoryItem(String title, String image) {
        this.title = title;
        this.image = image;
    }

    public CategoryItem() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
