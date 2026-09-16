package problem8;


public class GreetingDemo{
	
	public void generateGreeting() {
		Greeting greeting=new Greeting() {
			public void sayHello() {
                System.out.println("Hello! Welcome to Java Programming.");			}
		};
		greeting.sayHello();
	}
	
	
	public static void main(String[]args) {
		GreetingDemo demo=new GreetingDemo();
		demo.generateGreeting();
	}
}


