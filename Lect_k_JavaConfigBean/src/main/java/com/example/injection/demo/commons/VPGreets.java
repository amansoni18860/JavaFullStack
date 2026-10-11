package com.example.injection.demo.commons;

public class VPGreets  implements Greets{
	
	public VPGreets() {
		System.out.println("In Constructor : "+getClass().getSimpleName());
	}
	@Override
	public String sayHello() {
		return "HELLO VP";
	}
}
