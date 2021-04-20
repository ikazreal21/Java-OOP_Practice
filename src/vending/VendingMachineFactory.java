package vending;

import javax.swing.JOptionPane;

public class VendingMachineFactory {
    public String name;
    public String product1;
    public String product2;
    public String product3;
    public int product_prize1;
    public int product_prize2;
    public int product_prize3;
    public int product1stock;
    public int product2stock;
    public int product3stock;

    public void createVenMac() {
        name = JOptionPane.showInputDialog("Enter Manufacturer Name: ");
        product1 = JOptionPane.showInputDialog("Enter First Product Name: ");
        product2 = JOptionPane.showInputDialog("Enter Second Product Name: ");
        product3 = JOptionPane.showInputDialog("Enter Third Product Name: ");
        product_prize1 = Integer.parseInt(JOptionPane.showInputDialog("Enter how much is " + product1 + ": "));
        product_prize2 = Integer.parseInt(JOptionPane.showInputDialog("Enter how much is " + product2 + ": "));
        product_prize3 = Integer.parseInt(JOptionPane.showInputDialog("Enter how much is " + product3 + ": "));
        product1stock = Integer.parseInt(JOptionPane.showInputDialog("Enter how much Stock " + product1 + ": "));
        product2stock = Integer.parseInt(JOptionPane.showInputDialog("Enter how much Stock " + product2 + ": "));
        product3stock = Integer.parseInt(JOptionPane.showInputDialog("Enter how much Stock " + product3 + ": "));
    }

    public void restock() {
        product1stock += Integer.parseInt(JOptionPane.showInputDialog("Enter how much Stock " + product1 + ": "));
        product2stock += Integer.parseInt(JOptionPane.showInputDialog("Enter how much Stock " + product2 + ": "));
        product3stock += Integer.parseInt(JOptionPane.showInputDialog("Enter how much Stock " + product3 + ": "));

    }

}
