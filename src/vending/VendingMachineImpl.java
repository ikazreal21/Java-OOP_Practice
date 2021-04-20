package vending;

import javax.swing.JOptionPane;

public class VendingMachineImpl {
    static int dime, nickel, penny, quarter;
    static int amount;
    static Coins vending = new Coins();

    public void Inputcoin() {
        JOptionPane.showMessageDialog(null, "ENTER YOUR MONEY");
        dime = Integer.parseInt(JOptionPane.showInputDialog("Enter how much Dime" + "\nDime(10):"));
        penny = Integer.parseInt(JOptionPane.showInputDialog("Enter how much Penny" + "\nPenny(1):"));
        nickel = Integer.parseInt(JOptionPane.showInputDialog("Enter how much Nickel" + "\nNickel(5):"));
        quarter = Integer.parseInt(JOptionPane.showInputDialog("Enter how much Quarter" + "\nQuarter(25):"));
        amount += vending.Quarter(quarter);
        amount += vending.Penny(penny);
        amount += vending.Nickel(nickel);
        amount += vending.Dime(dime);
    }

}
