package vending;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VendingMachine {
	static int amountNeeded;
	static int selectProd;
	static int newAmount;
	static int res;
	static int res2;
	static int res3;

	static VendingMachineFactory Manu = new VendingMachineFactory();
	static Inventory checkStock = new Inventory();
	static VendingMachineImpl purchases = new VendingMachineImpl();

	// static stock stocks = new stock(Manu.product1stock, Manu.product2stock,
	// Manu.product3stock);

	// static int prod1 = Manu.product1stock;
	// static int prod2 = stocks.prod2();
	// static int prod3 = stocks.prod3();

	public static void main(String[] args) {

		do {
			Manu.createVenMac();
			JOptionPane.showMessageDialog(null, "Welcome to " + Manu.name + " Vending Machine");

			do {
				purchases.Inputcoin();
				// Transaction
				JOptionPane.showMessageDialog(null, "What Do you want to Purchase");
				selectProd = Integer.parseInt(
						JOptionPane.showInputDialog("Select 1 = " + Manu.product1 + "(" + Manu.product_prize1 + ")"
								+ ", 2 = " + Manu.product2 + "(" + Manu.product_prize2 + ")" + ", 3 = " + Manu.product3
								+ "(" + Manu.product_prize3 + ")" + "\nYour Balance: " + VendingMachineImpl.amount));

				res = JOptionPane.showOptionDialog(new JFrame(), "Do you want to Confirm your Purchase", "Conrimation",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Yes", "No" },
						JOptionPane.YES_OPTION);

				if (res == JOptionPane.YES_OPTION) {
					Product(selectProd);

					if (amountNeeded <= VendingMachineImpl.amount) {
						VendingMachineImpl.amount = newAmount = VendingMachineImpl.amount - amountNeeded;
						JOptionPane.showMessageDialog(null, "Purchase is Succesful Your Change is: " + newAmount);
						Stock(Manu.product1stock, Manu.product2stock, Manu.product3stock);
						checkStock.check(Manu.product1stock, Manu.product2stock, Manu.product3stock);

					} else if (amountNeeded >= VendingMachineImpl.amount) {
						JOptionPane.showMessageDialog(null, "Your Money is Not Enough");
					} else {
						break;
					}

					res2 = JOptionPane.showOptionDialog(new JFrame(), "Do you want to Purchase again?", "Exit",
							JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Yes", "No" },
							JOptionPane.YES_OPTION);

					if (res2 == JOptionPane.NO_OPTION) {
						break;
					}

				}
				if (res == JOptionPane.NO_OPTION) {
					System.exit(0);
				}

			} while (res2 == JOptionPane.YES_OPTION);

			res3 = JOptionPane.showOptionDialog(new JFrame(), "What do you want to do?", "Vending Machine",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Reset", "Restock" },
					JOptionPane.YES_OPTION);

			if (res3 == JOptionPane.YES_OPTION) {
				Manu.createVenMac();
				JOptionPane.showMessageDialog(null, "Welcome to " + Manu.name + " Vending Machine");
			} else if (res3 == JOptionPane.NO_OPTION) {
				Manu.restock();
			} else if (res3 == JOptionPane.CLOSED_OPTION) {
				System.exit(0);
			}
		} while (res3 == JOptionPane.CLOSED_OPTION);

	}

	public static void Product(int selectProd) {
		if (selectProd == 1) {
			amountNeeded = Manu.product_prize1;
			Manu.product1stock--;
		} else if (selectProd == 2) {
			amountNeeded = Manu.product_prize2;
			Manu.product2stock--;
		} else if (selectProd == 3) {
			amountNeeded = Manu.product_prize3;
			Manu.product3stock--;
		} else {
			System.exit(0);
		}

	}

	public static void Stock(int prod1, int prod2, int prod3) {
		JOptionPane.showMessageDialog(null, "Stocks Available: " + "\n" + Manu.product1stock + " " + Manu.product1
				+ "\n" + Manu.product2stock + " " + Manu.product2 + "\n" + Manu.product3stock + " " + Manu.product3);
	}
}
