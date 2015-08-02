package com.org.spring.hb;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class InsertTest {
public static void main(String[] args) {
	Resource r = new ClassPathResource("applicationContext.xml");
	BeanFactory factory = new XmlBeanFactory(r);
	EmployeeDAO dao = (EmployeeDAO)factory.getBean("dao");
	
	Employee e = new Employee();
	/*e.setId(57);
	e.setName("java");
	e.setSalary(6000);
	*/
	//dao.saveEmployee(e);
	
	List<Employee> list = dao.getAllEmployee(e);
	Iterator<Employee> it = list.iterator();
	while(it.hasNext()){
		System.out.println(it.next().getId()+" "+it.next().getName()+" "+it.next().getSalary());
	}
}
}
