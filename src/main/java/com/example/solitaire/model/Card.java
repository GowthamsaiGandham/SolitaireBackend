package com.example.solitaire.model;

public class Card {
    private int id;

    private int value;

    private int index;

    private boolean hide;

    private String imageUrl;

    public Card(int id, int value, int index, boolean hide, String imageUrl) {
        this.id = id;
        this.value = value;
        this.index = index;
        this.hide = hide;
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isHide() {
        return hide;
    }

    public void setHide(boolean hide) {
        this.hide = hide;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
