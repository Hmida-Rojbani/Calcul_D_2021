package de.tekup.calcul.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.tekup.calcul.services.CalculService;

@RestController
public class CalculCtrl {
	
	private CalculService service;

	public CalculCtrl(CalculService service) {
		super();
		this.service = service;
	}

	@RequestMapping(path= "/add/{a}/{b}")
	public int addCalcul(@PathVariable("a") int a,@PathVariable("b") int b) {
		return service.sum(a, b);
	}

}
