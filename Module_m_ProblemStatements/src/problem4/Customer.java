package problem4;

public class Customer {
	private int cid;
	private String name;
	private Account account;
	private Address address;

	public Customer(int cid, String name, Account account, Address address) {
		this.cid = cid;
		this.name = name;
		this.account = account;
		this.address = address;
	}

	public void displayDetails() {
		System.out.println("\n=== Customer Details ===");
		System.out.println("Customer ID: " + cid);
		System.out.println("Name: " + name);
		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("Balance: ₹" + account.getBalance());
		System.out.println("Address: " + address.toString());
	}

}
