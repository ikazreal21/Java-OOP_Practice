package vending;

import javax.swing.JOptionPane;

public class purchase {
    static int dime, nickel, penny, quarter;
    static int amount;
    static coins vending = new coins();

    public void Inputcoin() {
        JOptionPane.showMessageDialog(null, "ENTER YOUR MONEY");
        dime = Integer.parseInt(JOptionPane.showInputDialog("Enter how much Dime: "));
        penny = Integer.parseInt(JOptionPane.showInputDialog("Enter how much Penny: "));
        nickel = Integer.parseInt(JOptionPane.showInputDialog("Enter how much Nickel: "));
        quarter = Integer.parseInt(JOptionPane.showInputDialog("Enter how much Quarter: "));
        amount += vending.Quarter(quarter);
        amount += vending.Penny(penny);
        amount += vending.Nickel(nickel);
        amount += vending.Dime(dime);
    }

}
