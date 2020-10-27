package org.hcl.controller;

import javax.validation.Valid;

import org.hcl.entities.Manager;
import org.hcl.entities.ManagerLogin;
import org.hcl.services.ManagerServices;
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
@RequestMapping("/managerlogin")
public class ManagerLoginController {
	@Autowired
	ManagerServices service;
	@GetMapping("/managershow")
	public String showLogin(Model model)
	{
	    ManagerLogin log= new ManagerLogin();
	    model.addAttribute("managerlogin", log);
		return "managerlogin";
	}
	@PostMapping("/managerloginprocess")
	public ModelAndView loginProcess(@Valid @ModelAttribute("managerlogin") ManagerLogin managerlogin, BindingResult result , Model model)
	{
		
		ModelAndView modelAndView = new ModelAndView("confirm");
		Manager manager= service.getLogin(managerlogin.getId(), managerlogin.getPassWord());
		if(manager!= null){
			modelAndView.addObject("manager", manager);
			return modelAndView;
		}
		return modelAndView;
		
	}

}
