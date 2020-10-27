package org.hcl.controller;

import javax.validation.Valid;

import org.hcl.entities.Admin;
import org.hcl.entities.AdminLogin;
import org.hcl.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class AdminLoginController {
	@Autowired
	AdminService service;
	@GetMapping("/loginshow")
	public String showLogin(Model model)
	{
		AdminLogin log= new AdminLogin();
	    model.addAttribute("adminlogin", log);
		return "adminlogin";
	}
	@PostMapping("/processlogin")
	public ModelAndView loginProcess(@Valid @ModelAttribute("adminlogin") AdminLogin adminlogin, BindingResult result , Model model)
	{
		
		ModelAndView modelAndView = new ModelAndView("loginconfirm");
		Admin admin= service.getLogin(adminlogin.getId(), adminlogin.getPassWord());
		if(admin!= null){
			modelAndView.addObject("admin", admin);
			return modelAndView;
		}
		return modelAndView;
		
	}

}
