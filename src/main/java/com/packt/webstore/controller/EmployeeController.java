package com.packt.webstore.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.packt.webstore.domain.Employee;
import com.packt.webstore.service.impl.EmployeeService;
  

 
@Controller
@RequestMapping({"/employees"})
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	
 
	
 	@RequestMapping(value={"","/list"})
	public String listEmployees(Model model) {
 
 		
 		return "employees";
	}
	
  	@RequestMapping("/employee")
	public String getEmployeeByNumber(Model model, @RequestParam("id") int employeeId) {

  		// Replace
  		Employee employee = new Employee();
  		
  		model.addAttribute("employee", employee);
		return "employee";
	}

	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addNewEmployee(@ModelAttribute("newEmployee") Employee newEmployee) {
	   
		return "addEmployee";
	}
	   
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String processAddNewEmployee(@ModelAttribute("newEmployee") Employee employee) {
    
		
		employeeService.save(employee);
	   	return "redirect:/employees/list";
	}
	
 
}
