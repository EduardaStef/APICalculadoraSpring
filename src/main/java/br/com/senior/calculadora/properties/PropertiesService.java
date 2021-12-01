package br.com.senior.calculadora.properties;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PropertiesService {
	
	@Value("${br.com.senior.calculadora.password}")
	private String password;

	public String getPassword() {
		return password;
	}
	
}
