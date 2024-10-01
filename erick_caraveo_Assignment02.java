import javax.swing.JOptionPane;
public class erick_caraveo_Assignment02 {

	public static void main(String[] args) {	
			
		String firstName;
		String lastName;
		int age;
		double grossAnnualPay;
		double taxRate;
		double netAnnualPay;
		firstName = JOptionPane.showInputDialog(null,"What is your first name?");
		String mIinput = JOptionPane.showInputDialog("What is your middle initial");
		char middleInitial = mIinput.charAt(0);
		lastName = JOptionPane.showInputDialog(null,"What is your last name?");
		age = Integer.parseInt(JOptionPane.showInputDialog("What is your age? (Number)"));
		grossAnnualPay = Double.parseDouble(JOptionPane.showInputDialog("What is your Annual Gross Pay? (Number)"));
		taxRate = Double.parseDouble(JOptionPane.showInputDialog("What is your Tax Rate?"));
		netAnnualPay = grossAnnualPay - (grossAnnualPay * taxRate);
		
		System.out.println("Hello " + firstName + " " + middleInitial + ". " + lastName + ", \r\n"
							+ "you are " + age + " years old now. It is amazing that you made "
							+ grossAnnualPay + " dollars this year. \r\n With the tax rate of " + taxRate
							+ " you can take home " + netAnnualPay + " dollars.");
	}

}
