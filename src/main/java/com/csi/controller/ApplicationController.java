package com.csi.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {

	
	@GetMapping
	public String sayHello() {
		
		return "Welcome to Saurabh Finance Company";
	}
	
	@GetMapping("/service")
	public String sayService() {
		
		return "Agri Loan | CreditCard Loan | Eduction Loan";
	}
	@GetMapping("/address")
	public String sayAddress() {
		
		return "NAGPUR | MH | INDIA";
	}
	@GetMapping("/listofemployee")
	public List<Employee> getAllData() {
		
		return Stream.of(new Employee(121,"Saurabh"),new Employee(122,"Karishma")).collect(Collectors.toList());
	}
}
