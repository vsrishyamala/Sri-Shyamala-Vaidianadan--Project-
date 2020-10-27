package org.hcl.controller;

import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.hcl.entities.PilotsDetails;
import org.hcl.services.PilotService;
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
@RequestMapping("/pilot")
public class PilotController {
	@Autowired
	PilotService service;
	@GetMapping("/pilotshow")
	public String showPlanes(Model model)
	{
		PilotsDetails pilots= new PilotsDetails();
		model.addAttribute("pilots", pilots);
		return "pilots";
	}
	@PostMapping("/pilotprocess")
	public String processForm(@Valid @ModelAttribute("pilots") PilotsDetails pilots,BindingResult result, Model model)
	{
		service.insert(pilots);
		model.addAttribute("message","Successfully inserted");
		return "pilots";
	}
	@RequestMapping("/viewpilot")
	 public ModelAndView listEmployee(ModelAndView model) throws IOException {
	        List<PilotsDetails> listPilot = service.listPilot();
	        model.addObject("listPilot", listPilot);
	        model.setViewName("listPilot");
	        return model;
	    }
	

}
