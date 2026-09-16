package lect_a_Threading;

class Table {
	
	public synchronized void printTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n+" * "+i+" = "+(n*i));
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class First extends Thread{
	Table t;
	public First(Table t) {
		this.t=t;
	}
	
	public void run() {
		t.printTable(19);
	}
}

class Second extends Thread{
	Table t;
	
	public Second(Table t) {
		this.t=t;
	}
	
	public void run() {
		t.printTable(17);
	}
}



class Third extends Thread{
	Table t;
	
	public Third(Table t) {
		this.t=t;
	}
	
	public void run() {
		t.printTable(18);
	}
}


public class SynchronizeDemo{
	public static void main(String[]args) {
		
		Table t=new Table();
		
		First t1=new First(t);
		t1.start();
		
		Second t2=new Second(t);
		t2.start();
		
		Third t3=new Third(t);
		t3.start();
	}
}