
package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Student;
import com.serviceInterface.ServiceInterface;


@Controller
public class HomeController {
@Autowired
	ServiceInterface service;
	
	@RequestMapping("/")
	public String Start()
	{
		System.out.println("In start");
		return "Login";
		
	}
	
	@RequestMapping("/registerpage")
	public String RegisterPage()
	{
		System.out.println("In register");
		return "Register";
	}
	
	@RequestMapping("/reg")
	public String saveStudent(@ModelAttribute Student s,Model model)
	{
       System.out.println("In reg");
	
		Student id=service.saveStudent(s);
		System.out.println(id);
		if(id!=null)
		{
			model.addAttribute("msg","Data is saved Successfully !");
			return "Login";
		}
		else
		{
			model.addAttribute("msg","Data is not saved !");
			return "Register";
		}
	}
	
	
	@RequestMapping("/log")
	public String loginStudent(@ModelAttribute Student s,Model model)
	{
		System.out.println("In log");
		Student s1=service.loginStudent(s);
	if(s1!=null)
	{
		List<Student> list=service.getAllData();
	model.addAttribute("data",list);
	return "Success";
	}
	else	
	{
		model.addAttribute("msg","Wrong username and password");
	}
	return "Login";
		
	
}
	
	
	
	
	
	@RequestMapping("/edit")
	public String editStudent(@RequestParam int id,Model model)
	{
		System.out.println("In edit controller------");
		service.editStudent(id);
	Student s=service.editStudent(id);
		model.addAttribute("sdata",s);
		return "Edit";
	}
	
	
	@RequestMapping("/update")
	public String updateStudent(@ModelAttribute Student s,Model model)
	{
		System.out.println("In update");
		Student s1=service.updateStudent(s);
		List<Student>li=service.getAllData();
		model.addAttribute("sdata", li);
		return "Success";
	}
	
	
	
	
}
