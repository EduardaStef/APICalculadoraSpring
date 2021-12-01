package br.com.senior.calculadora.password;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("!dev")
@Service
public class PasswordServiceDefault implements PasswordService {

	@Override
	public String getMessage() {
		return "senha";
	}

	@Override
	public boolean isValid(String senha) {
		if (getMessage().equals(senha)) {
			return true;
		}
		return false;
	}

}
