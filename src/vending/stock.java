package vending;

public class stock {

    private int prod1;
    private int prod2;
    private int prod3;

    public stock(int prod1, int prod2, int prod3) {
        this.prod1 += prod1;
        this.prod2 += prod2;
        this.prod3 += prod3;
    }

    public int prod1() {
        return this.prod1;
    }

    public int prod2() {
        return this.prod2;
    }

    public int prod3() {
        return this.prod3;
    }

}
