package com.example.hibernate.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hibernate.entity.Employee;
import com.example.hibernate.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/list")
	public String listEmployees(Model model) {
	    List<Employee> emps = empService.findAll();

	    for (Employee emp : emps) {
	        System.out.println(emp);
	    }

	    model.addAttribute("employees", emps);
	    return "list-emps";
	}
	
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		Employee employee=new Employee();
		model.addAttribute("employee", employee);
		return "employee-form";
	}
	
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("employeeId") int theId,Model theModel) {
		
		Optional<Employee> theEmployee=empService.findById(theId);
		theModel.addAttribute("employee",theEmployee);
		return "employee-form";
	}

	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		
		empService.save(employee);
		return "redirect:/list";
	}
	
	
	@GetMapping("/delete")
	public String delete(@RequestParam("employeeId")int theId) {
		empService.deleteById(theId);
		return "redirect:/list";
		
	}
	
	

}
