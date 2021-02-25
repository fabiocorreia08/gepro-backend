package br.gov.cmb.gepro.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		
		return "<html><h1>gepro-api-v1.0.0</h1></html>";
	}

}
