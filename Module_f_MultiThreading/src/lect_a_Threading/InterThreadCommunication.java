package lect_a_Threading;

class Customer{
	double balance;
	
	public Customer (double balance) {
		this.balance=balance;
	}
	
	public void getBalance() {
		System.out.println("Balance : "+balance);
	}
	
	public synchronized void withdraw(double amount) {
		System.out.println("Going to Withdraw : ");
		
		if(amount>balance) {
			System.out.println("Less Balance : Waiting for deposit");
			
			try {
				wait();
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		balance=balance-amount;
		
		System.out.println("Withdraw Completed!");
		getBalance();
	}
	
	public synchronized void deposit(double amount) {
		System.out.println("Going to Deposit:");
		balance=balance+amount;
		System.out.println("Deposit Completed");
		getBalance();
		notify();
	}
}
public class InterThreadCommunication {

	public static void main(String[]args) {
		Customer c1=new Customer(25000);
		
		new Thread() {
			public void run() {
				c1.withdraw(30000);
			}
		}.start();
		
		
		new Thread() {
			public void run() {
				c1.deposit(25000);
			}
		}.start();
	}
}
