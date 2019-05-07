package com.kce.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.HttpServletBean;

import com.kce.model.User;
import com.kce.service.CourseService;

@Controller
public class CourseController {

	@Autowired
	CourseService cservice;
	
	@Autowired
	HttpServletRequest request;
	
	@Autowired
	HttpSession ses;
	
	@RequestMapping("/")
	public String start()
	{
		return "home";
	}
	
	@RequestMapping("/user")
	public String user()
	{
		return "user1";
	}
	
	@RequestMapping("/sign")
	public String sign()
	{
		return "signup";
	}
	@RequestMapping("/admin")
	public String admin()
	{
		return "admin";
	}
	
	@RequestMapping(value="/login")
	public String dologin(@ModelAttribute("log") User use)
	{
		String n=use.getUnmae();
		String pas=use.getPass();
		if(cservice.dologin(n,pas)==1)
		{
			return "courses";
		}
		else
		{
			return "user1";
		}
	}
	
	@RequestMapping(value="/sup")
	public String dosignup(@ModelAttribute("newuser") User use)
	{
		if(cservice.dostart(use)!=null)
		{
			return "courses";
		}
		else
		{
			return "user1";
		}
	}
	
}
