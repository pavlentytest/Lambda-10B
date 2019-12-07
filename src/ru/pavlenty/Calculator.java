package ru.pavlenty;

public class Calculator {
    protected int x;
    protected int y;

    /*
    Calculator() {
        this.x = 0;
        this.y = 0;
    }
     */

    Calculator(int xx, int yy) {
        this.x = xx;
        this.y = yy;
    }

    public int sum() {
        return this.x + this.y;
    }

    public int mult() {
        return this.x * this.y;
    }

}
