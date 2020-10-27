package org.hcl.controller;

import java.util.List;
import java.io.IOException;

import javax.validation.Valid;

import org.hcl.entities.Planes;
import org.hcl.services.PlaneService;
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
@RequestMapping("/plane")
public class PlaneController {
	@Autowired
	PlaneService service;
	@GetMapping("/addplane")
	public String showPlanes(Model model)
	{
		Planes planes= new Planes();
		model.addAttribute("plane", planes);
		return "plane";
	}
	@PostMapping("/planeprocess")
	public String processForm(@Valid @ModelAttribute("plane") Planes plane,BindingResult result, Model model)
	{
		service.insertPlane(plane);
		model.addAttribute("message","Successfully inserted");
		return "plane";
	}
	@RequestMapping("/viewplane")
	 public ModelAndView listEmployee(ModelAndView model) throws IOException {
	        List<Planes> listPlane = service.listPlane();
	        model.addObject("listPlane", listPlane);
	        model.setViewName("listPlane");
	        return model;
	    }

}
