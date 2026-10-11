package com.example.injection.demo.commons;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ManagerGreet implements Greets {
	@Override
	public String sayHello() {
		return "HELLO Manager";
	}
}
