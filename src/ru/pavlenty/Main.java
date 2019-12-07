package ru.pavlenty;

public class Main {

    public static void main(String[] args) {
        int a = 8;
        int b = 9;

        Calculator c = new Calculator(a,b);
        System.out.println(c.sum());

        MiniCalculator m = new MiniCalculator(7,8);
        System.out.println(m.sum());

        Devideable d = new Devideable();

        Devideable d2 = new Devideable() {
            @Override /* переопределение */
            public double devide(int m, int n) {
                return m/n;
            }
        };
        d2.devide(6,7);

        int x = 5;
        int y = x;

        Devideable d3 = new Devideable() {
            @Override
            public double devide(int m, int n) {
                return m/m*m;
            }
        };
        d3.devide(9,7);

    }
}
