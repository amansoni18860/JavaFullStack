package lec_f_Association_and_Composition;

public class Customer {
	private int cid;
	private String cname;
	private static String bank="SBI";
	private Account account;
	
	public Customer(int cid,String cname,Account account) {
		this.cid=cid;
		this.cname=cname;
		this.account=account;
	}
	
	public void display() {
		System.out.println(cid+" "+cname+" "+bank);
		account.getAccount();
	}

	public static void main(String[] args) {

		Account a1=new Account(123455,"Saving",1000000);
		Customer c1=new Customer(10111,"Abc",a1);
		c1.display();
	}

}
