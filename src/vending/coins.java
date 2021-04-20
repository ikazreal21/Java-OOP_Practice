package vending;

public class coins {

    private int dime;
    private int penny;
    private int nickel;
    private int quarter;

    public int Dime(int amount) {
        this.dime = amount;
        dime = this.dime * 10;
        return dime;
    }

    public int Penny(int amount) {
        this.penny = amount;
        penny = this.penny * 1;
        return penny;
    }

    public int Nickel(int amount) {
        this.nickel = amount;
        nickel = this.nickel * 5;
        return nickel;
    }

    public int Quarter(int amount) {
        this.quarter = amount;
        quarter = this.quarter * 25;
        return quarter;
    }

}
