package ru.pavlenty;

public class MiniCalculator extends Calculator
implements Devideable
{
    MiniCalculator(int xx, int yy) {
        super(xx, yy);// Calculator(5,6)
    }

    @Override
    public double devide(int m, int n) {
        return m/n;
    }
}
