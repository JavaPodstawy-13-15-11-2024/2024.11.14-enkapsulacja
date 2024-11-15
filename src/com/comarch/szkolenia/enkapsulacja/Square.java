package com.comarch.szkolenia.enkapsulacja;

public class Square {
    private int side;
    private int field;
    private int circle;

    public Square(int side) {
        this.setSide(side);
    }

    public Square() {
    }

    public int getSide() {
        return this.side;
    }

    public int getField() {
        return this.field;
    }

    public int getCircle() {
        return this.circle;
    }

    public void setSide(int side) {
        this.side = side;
        this.field = side * side;
        this.circle = side * 4;
    }
}
