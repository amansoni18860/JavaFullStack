package com.example.hibernate.security;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class DemoSecurityConfig {

	@Bean
	UserDetailsManager userDetailsManager(DataSource dataSource) {

		JdbcUserDetailsManager manager = new JdbcUserDetailsManager(dataSource);

		manager.setUsersByUsernameQuery("select username, pass, active from members where username=?");

		manager.setAuthoritiesByUsernameQuery("select username, authority from auth where username=?");

		return manager;
	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

		http.authorizeHttpRequests(configurer -> configurer.requestMatchers("/h2-console/**").permitAll()
				.requestMatchers(HttpMethod.GET, "/employees").hasRole("Employee")
				.requestMatchers(HttpMethod.GET, "/employees/**").hasRole("Employee")
				.requestMatchers(HttpMethod.POST, "/employees").hasRole("Manager")
				.requestMatchers(HttpMethod.PUT, "/employees").hasRole("Manager")
				.requestMatchers(HttpMethod.DELETE, "/employees/**").hasRole("Admin").anyRequest().authenticated());

		http.httpBasic(Customizer.withDefaults());

		http.csrf(csrf -> csrf.disable());

		http.headers(headers -> headers.frameOptions(frameOptions -> frameOptions.disable()));

		return http.build();
	}
}