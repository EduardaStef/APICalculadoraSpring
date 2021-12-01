//package br.com.senior.calculadora.password;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Required;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/")
//public class PasswordController {
//
//	@Autowired
//	private PasswordService passwordService;
//	
//	@GetMapping
//	public String get() {
//		return passwordService.getMessage();
//	}
//	
//	@GetMapping("/add")
//	public ResponseEntity<?> add(@RequestParam(value = "senha", required = false) String senha, @RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
//		if(passwordService.isValid(senha)) {
//			return ResponseEntity.ok().body(num1 + num2);
//		}
//		return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Acesso negado");
//	}
//	
//	
//}
