package com.SpringBoot.RestApi.Controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.RestApi.EmployeeService.EmployeeService;
import com.SpringBoot.RestApi.Entity.EmployeeBean;

import com.SpringBoot.RestApi.repository.EmployeeBeanRepository;

@RestController
@RequestMapping("/MotivityLabs")
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@Autowired
	EmployeeBeanRepository repository;

	@GetMapping(path = "/{CName}")
	public String getCompanyName(@PathVariable String CName) {
		
		return service.companyName();
		
	}

	@GetMapping("/CEmployees")
	public List<EmployeeBean> getCompanyEmployees() {
		
		List<EmployeeBean> l3 = service.employeeNames();
		
		return l3;
		
	}
	@GetMapping("/EmpById/{getById}")
	public EmployeeBean getByYourId(@PathVariable String getById) throws IdNotFoundException {

		Optional<EmployeeBean> l2 = repository.findById(getById);
		
		if(l2.isEmpty()) {
			throw new IdNotFoundException("Id is not present in Database");
		}

		return l2.get();
	}
	@RequestMapping(value="getAll",method = RequestMethod.GET)
	public List<EmployeeBean> getByAll1(@PathVariable String getByName)
	{
		
		List<EmployeeBean> l3 = service.employeeNames();
		return  l3;
		
	}
	@RequestMapping(value="ExistByName", method = RequestMethod.GET)
	public boolean ExistBy(@PathVariable String ename)  {
		boolean result = EmployeeBean.ExistByName(ename);
		return result;
	}
	@GetMapping("/EmpByName/{getByName}")
	public List<EmployeeBean> getByYourName(@PathVariable String getByName) {		
		List<EmployeeBean> list = repository.findAll();
		List<EmployeeBean> store = new ArrayList<>();
		
		for(EmployeeBean x : list) {		
			if(x.getEname().equals(getByName)) store.add(x);			
		}

//		return list;
//		Optional<List<EmployeeBean>> l4 = Optional.ofNullable(repository.findByEname(getByName));
//
//		List<EmployeeBean> list = repository.findByEname(getByName);
	return list;
	}
}
