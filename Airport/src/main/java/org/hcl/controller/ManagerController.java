package org.hcl.controller;

import org.hcl.entities.Manager;
import org.hcl.services.ManagerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/manager")
public class ManagerController {
	@Autowired
	ManagerServices service;
	@GetMapping("/showmanager")
	public String showManager(Model model)
	{
		Manager manager= new Manager();
		model.addAttribute(manager);
		return "managerregister";
	}
	@PostMapping("/processmanager")
	public String processManager(@ModelAttribute("manager") Manager manager, Model model)
	{
		service.insertManger(manager);
		model.addAttribute("managaerregister" ,"Successfullyinserted");
		return "managersuccess";
	}

}
