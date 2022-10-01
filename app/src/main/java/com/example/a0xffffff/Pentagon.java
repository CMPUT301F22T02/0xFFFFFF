package com.example.a0xffffff;

public class Pentagon extends Shape {

    private int side;
    private int angle;
    private String color = "blue";

    public Pentagon(int side, int angle, String color) {
        this.side = side;
        this.angle = angle;
        this.color = color;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
