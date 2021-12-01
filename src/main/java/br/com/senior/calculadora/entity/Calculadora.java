package br.com.senior.calculadora.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Calculadora {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private Double num1;
	
	@Column(nullable = false)
	private Double num2;
	
	@Column
	private String numbers;

	public String getNumbers() {
		return numbers;
	}

	public void setNumbers(String numbers) {
		this.numbers = numbers;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Double getNum1() {
		return num1;
	}

	public void setNumero1(Double num1) {
		this.num1 = num1;
	}

	public Double getNumero2() {
		return num2;
	}

	public void setNumero2(Double numero2) {
		this.num2 = numero2;
	}
	
	public Double sum() {
		return this.num1+this.num2;
	}

}
