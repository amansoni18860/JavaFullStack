package problem4;

public class CustomerAccountManagement {
	
	public static void main(String[] args) {
		System.out.println("--- Customer Account Management System ---\n");
		// Create address and account
		Address addr = new Address("12 Park Street", "New Delhi", "Delhi", "110001");
		Account acc = new Account("123456789", 0.0);
		// Create customer
		Customer cust = new Customer(101, "John Doe", acc, addr);

		// Perform transactions
		acc.deposit(2000);
		try {
			acc.withdraw(1500); // successful
			System.out.println("Current Balance: ₹" + acc.getBalance());
			System.out.println("\nAttempting another withdrawal of ₹1000...");
			acc.withdraw(1000); // should throw exception
		} catch (InsufficientBalanceException e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
		// Display final details
		cust.displayDetails();
	}

}
