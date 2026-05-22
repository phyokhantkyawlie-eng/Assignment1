package controlflow;

import javax.swing.JOptionPane;

public class ProgramNine {

	public static void main(String[] args) {
		
		int OrderCount;
		
		do {
			
			OrderCount = Integer.parseInt(
					JOptionPane.showInputDialog("Enter Number of Orders."));
			
			if (OrderCount <= 0) {
				JOptionPane.showMessageDialog(null,
						"There must be at least one order to calculate.");
			}
			
		} while (OrderCount <= 0);

		
		double[] prices = new double[OrderCount];

		
		int i = 0;

		while (i < prices.length) {

			prices[i] = Double.parseDouble(
					JOptionPane.showInputDialog(
							"Enter price for food " + (i + 1)));

			i++;
		}

		
		double total = 0;

		for (double price : prices) {
			total += price;
		}

		
		double tax = total * 0.07;

		
		double finalTotal = total + tax;


		double discount = 0;

		if (finalTotal >= 1000) {
			discount = finalTotal * 0.10;
		}


		double grandTotal = finalTotal - discount;


		JOptionPane.showMessageDialog(null,
				
				"Restaurant Bill Summary"
				+ "\n----------------------"
				+ "\nSubtotal: " + total
				+ "\nTax (7%): " + tax
				+ "\nDiscount: " + discount
				+ "\nGrand Total: " + grandTotal);


		if (grandTotal >= 1500) {
			
			JOptionPane.showMessageDialog(null,
					"VIP Customer 😼 Thanks for dining with us!");
			
		} else {
			
			JOptionPane.showMessageDialog(null,
					"Thank you for dining with us!");
		}
	}
}