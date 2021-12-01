package br.com.senior.calculadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.senior.calculadora.password.PasswordService;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

	@Autowired
	private PasswordService passwordService;
	
	@GetMapping("/add")
	public ResponseEntity<?> add(@RequestParam(value = "senha", required = false) String senha, @RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
		if(passwordService.isValid(senha)) {
			return ResponseEntity.ok().body(num1 + num2);
		}
		return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Acesso negado");
	}

	@GetMapping("/sub")
	public ResponseEntity<?> sub(@RequestParam(value = "senha", required = false) String senha, @RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
		if(passwordService.isValid(senha)) {
			return ResponseEntity.ok().body(num1 - num2);
		}
		return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Acesso negado");
	}

	@GetMapping("/multiply")
	public ResponseEntity<?> multiply(@RequestParam(value = "senha", required = false) String senha, @RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
		if(passwordService.isValid(senha)) {
			return ResponseEntity.ok().body(num1 * num2);
		}
		return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Acesso negado");
	}

	@GetMapping("/div")
	public ResponseEntity<?> div(@RequestParam(value = "senha", required = false) String senha, @RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
		if(passwordService.isValid(senha)) {
			return ResponseEntity.ok().body(num1 / num2);
		}
		return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Acesso negado");
	}

	@GetMapping("/numbers/add")
	public ResponseEntity<?> numbersAdd(@RequestParam(value = "senha", required = false) String senha, @RequestParam(value = "numbers") String numbers) {

		String[] nums = numbers.split(",");
		Double result = (double) 0;

		for (int i = 0; i < nums.length; i++) {
			result += Double.parseDouble(nums[i]);
		}

		if(passwordService.isValid(senha)) {
		return ResponseEntity.ok().body(result);
		}
		return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Acesso negado");
	}
	
	@GetMapping("/numbers/sub")
	public ResponseEntity<?> numbersSub(@RequestParam(value = "senha", required = false) String senha, @RequestParam("numbers") String numbers) {
		String[] nums = numbers.split(",");
		Double result = (double) 0;

		for (int i = 0; i < nums.length; i++) {
			result -= Double.parseDouble(nums[i]);
		}

		if(passwordService.isValid(senha)) {
		return ResponseEntity.ok().body(result);
		}
		return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Acesso negado");
	}
	
	@GetMapping("/numbers/multiply")
	public ResponseEntity<?> numbersMultiply(@RequestParam(value = "senha", required = false) String senha, @RequestParam("numbers") String numbers) {
		String[] nums = numbers.split(",");
		Double result = (double) 1;

		for (int i = 0; i < nums.length; i++) {
			result *= Double.parseDouble(nums[i]);
		}

		if(passwordService.isValid(senha)) {
		return ResponseEntity.ok().body(result);
		}
		return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Acesso negado");
	}
	
	@GetMapping("/numbers/div")
	public ResponseEntity<?> numbersDiv(@RequestParam(value = "senha", required = false) String senha, @RequestParam("numbers") String numbers) {
		
		String[] nums = numbers.split(",");

		Double result = Double.parseDouble(nums[0]);

		for (int i = 1; i < nums.length; i++) {
			result /= Double.parseDouble(nums[i]);
		}

		if(passwordService.isValid(senha)) {
			return ResponseEntity.ok().body(result);
			}
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Acesso negado");
	}

}
