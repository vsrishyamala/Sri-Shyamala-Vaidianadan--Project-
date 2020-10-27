package org.hcl.controller;

import java.io.IOException;
import java.util.List;

import org.hcl.entities.Admin;
import org.hcl.entities.Hangar;
import org.hcl.entities.PilotsDetails;
import org.hcl.services.HangarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hangar")
public class HangarController {
	@Autowired
	HangarService service;
	@GetMapping("/hangarshow")
	public String showAdminForm(Model model)
	{
		Hangar hangar= new Hangar();
		model.addAttribute(hangar);
		return "hangar";
	}
	@PostMapping("/hangarprocess")
	public String processForm(@ModelAttribute("hangar") Hangar hangar, Model model)
	{
		service.insertHangar(hangar);
		model.addAttribute("message","Successfully inserted");
		return "hangar";
	}
	@RequestMapping("/viewhangar")

	 public ModelAndView listEmployee(ModelAndView model) throws IOException {
	        List<Hangar> listHangar = service.listHangar();
	        model.addObject("listHangar", listHangar);
	        model.setViewName("listHangar");
	        return model;
	    }

}
