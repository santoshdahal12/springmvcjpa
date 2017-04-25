package com.packt.webstore.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.packt.webstore.domain.Employee;


public interface EmployeeService {
	public void save(Employee employee);


}
