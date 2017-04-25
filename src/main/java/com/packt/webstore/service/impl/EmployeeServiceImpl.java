package com.packt.webstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.packt.webstore.domain.Employee;
import com.packt.webstore.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	 EmployeeRepository employeeRepository;

	@Override
	public void save(Employee employee) {
		 employeeRepository.save(employee);

		// TODO Auto-generated method stub
	
	}

}
