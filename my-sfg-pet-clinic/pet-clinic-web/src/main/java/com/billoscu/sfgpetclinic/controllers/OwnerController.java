package com.billoscu.sfgpetclinic.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.billoscu.sfgpetclinic.services.OwnerService;

@RequestMapping("/owners")
@Controller
public class OwnerController {

	private final OwnerService ownerService;
	// autowired by constructor
	public OwnerController(OwnerService ownerService) {
		this.ownerService = ownerService;
	}



	@RequestMapping({"","/","/index.html"})
	public String listOwners(Model model) {
		model.addAttribute("owners",ownerService.findAll());
		return "owners/index";
	}
	
}
