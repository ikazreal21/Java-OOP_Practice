package vending;

import javax.swing.JOptionPane;

public class Inventory {

    public void check(int prod1, int prod2, int prod3) {
        if (prod1 == 0 && prod2 != 0 && prod3 != 0) {
            JOptionPane.showMessageDialog(null, "Product 1 is Out of Stock");
        } else if (prod1 != 0 && prod2 == 0 && prod3 != 0) {
            JOptionPane.showMessageDialog(null, "Product 2 is Out of Stock");
        } else if (prod1 == 0 && prod2 == 0 && prod3 != 0) {
            JOptionPane.showMessageDialog(null, "Product 2 is Out of Stock");
        } else if (prod1 == 0 && prod2 == 0 && prod3 == 0) {
            JOptionPane.showMessageDialog(null, "All Products are out of Stock!!");
            System.exit(0);
        }
    }
}
