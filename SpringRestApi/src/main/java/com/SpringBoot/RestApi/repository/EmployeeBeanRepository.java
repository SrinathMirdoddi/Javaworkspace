package com.SpringBoot.RestApi.repository;





import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.SpringBoot.RestApi.Entity.EmployeeBean;

@Component
public interface EmployeeBeanRepository extends JpaRepository<EmployeeBean, String> {

	public EmployeeBean getByYourId(@PathVariable String getById);
//	@Query(value = " select * from employee_bean where ename = Srikrishna)
//	List<EmployeeBean> getByNames(String getByName);
   //  List<EmployeeBean> findByEname(String name);
	
}
