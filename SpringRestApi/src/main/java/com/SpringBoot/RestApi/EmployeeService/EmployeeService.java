package com.SpringBoot.RestApi.EmployeeService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.SpringBoot.RestApi.Entity.EmployeeBean;
import com.SpringBoot.RestApi.repository.EmployeeBeanRepository;

@Component
@Service
public class EmployeeService {
	
	@Autowired
	EmployeeBeanRepository repository;
	
	
	public String companyName() {
		
		return "Motivity Labs";
	}
	@Transactional
	public List<EmployeeBean> setterMethod() {
		
		List<EmployeeBean> l = new ArrayList<EmployeeBean>();
		l.add(new EmployeeBean("Srijan","MLI1086"));
		l.add(new EmployeeBean("Srinath","MLI1092"));
		l.add(new EmployeeBean("Srikrishna","MLI1106"));
		l.add(new EmployeeBean("Saikumar","MLI1103"));
		
		for(EmployeeBean b : l) {
			
			repository.save(b);
		}
		 
		return l;
		
	}
	
	public List<EmployeeBean> employeeNames(){
		
		return setterMethod();
		
	}
	
	
}