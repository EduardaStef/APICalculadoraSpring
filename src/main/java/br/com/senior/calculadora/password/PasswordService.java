package br.com.senior.calculadora.password;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public interface PasswordService {

	String getMessage();
	
	boolean isValid(String senha);
		
}
