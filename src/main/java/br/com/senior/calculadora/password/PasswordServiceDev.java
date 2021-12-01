package br.com.senior.calculadora.password;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("dev")
@Service
public class PasswordServiceDev implements PasswordService {
	
	public String getMessage() {
		return "";
		
	}
	@Override
	public boolean isValid(String senha) {
		return true;
	}
}