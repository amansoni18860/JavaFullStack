package lec_i_abstraction;

abstract class AtmClass {
	
	double intRate;
	
	public AtmClass(double intRate) {
		this.intRate=intRate;
	}
	
	abstract void withdraw();
	abstract void deposit();
	
	// concrete method
	
	void disp() {
		System.out.println("I'm ATM");
		
	}

}
