package com.org.spring.DAO;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.org.spring.hb.Employee;

public class UserDAO {
private HibernateTemplate template;
private JdbcTemplate template2;

public void setTemplate2(JdbcTemplate template){
	this.template2 = template;
}
public void setTemplate(HibernateTemplate template){
	this.template = template;
}

public List<Employee> getUsers(){
	List<Employee> list = template.loadAll(Employee.class);
return list;
}

public List<Employee> getUserDetailsById(int id){
	List<Employee> list = template2.query("select * from employee where id="+id+"", new BeanPropertyRowMapper(Employee.class));
return list;
}

public int  saveUser(String name,int salary){
	System.out.println("insert into employee values("+null+",'"+name+"',"+salary+")");
	int i = template2.queryForInt("insert into employee values(null,'"+name+"',"+salary+")");
return i;
}
}
