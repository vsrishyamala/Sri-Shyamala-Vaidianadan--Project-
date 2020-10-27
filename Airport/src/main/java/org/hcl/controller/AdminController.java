package org.hcl.controller;

import javax.validation.Valid;

import org.hcl.entities.Admin;
import org.hcl.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	AdminService service;
	@GetMapping("/show")
	public String showAdminForm(Model model)
	{
		Admin admin= new Admin();
		model.addAttribute(admin);
		return "adminregister";
	}
	@PostMapping("/process")
	public String processForm(@Valid @ModelAttribute("admin") Admin admin,BindingResult result, Model model)
	{
		service.insertAdmin(admin);
		model.addAttribute("message","Successfully inserted");
		return "adminsuccess";
	}

}
