package com.org.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.org.spring.DAO.UserDAO;
import com.org.spring.hb.Employee;

@Controller
public class HomeController {

	@Autowired
	private UserDAO userDAO;
	
	@RequestMapping("hello")
	public ModelAndView getUser(){
	List<Employee>	listUser  = userDAO.getUsers();
	ModelAndView model = new ModelAndView("result");
	model.addObject("customer", listUser);
	return model;
	}
	
	@RequestMapping("getid")
	public ModelAndView getUserById(HttpServletRequest req){
		int id = Integer.parseInt(req.getParameter("id"));
		List<Employee> list = userDAO.getUserDetailsById(id);
		
		ModelAndView model2 = new ModelAndView("result");
		model2.addObject("getUserById", list);
		return model2;
	}
	
	@RequestMapping("reg")
	public ModelAndView saveUser(HttpServletRequest req){
		String name = req.getParameter("userName");
		int salary = Integer.parseInt(req.getParameter("salary"));
		int i = userDAO.saveUser(name, salary);
		ModelAndView model = new ModelAndView("result");
		model.addObject("getNum", i);
		return model;
	}
	
}
