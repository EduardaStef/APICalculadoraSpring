package br.com.senior.calculadora.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Profile("!dev")
@RestController
@RequestMapping("/")
public class PropertiesController {

	@Autowired
	private PropertiesService propertiesService;
	
	
	
}
