package com.packt.webstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.packt.webstore.domain.Address;
import com.packt.webstore.domain.Employee;

public interface AddressRepository  extends  CrudRepository<Address, Long>  {

}
