package com.chezouam.tabletennis.entity;

public enum Color {
    RED("red") ,BLACK("black");

    private String  color;

    Color(String color) {
        this.color = color;
    }

    public String  getColor(){
        return color;
    }

    @Override
    public String toString() {
        return color;
    }
}
