package com.org.spring.hb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class EmployeeDAO {
HibernateTemplate template;
public void setTemplate(HibernateTemplate template){
	this.template = template;
}

public void saveEmployee(Employee e){
	template.save(e);
}

public List<Employee> getAllEmployee(Employee e){
	List<Employee> list = new ArrayList<>();
	list = template.loadAll(Employee.class);
return list;
}
}
