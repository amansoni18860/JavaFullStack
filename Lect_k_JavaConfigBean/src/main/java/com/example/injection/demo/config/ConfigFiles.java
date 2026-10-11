package com.example.injection.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.injection.demo.commons.Greets;
import com.example.injection.demo.commons.VPGreets;

@Configuration
public class ConfigFiles {

	@Bean
	public Greets vPGreets() {
		return new VPGreets();
	}
}
