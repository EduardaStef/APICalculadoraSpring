package br.com.senior.calculadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senior.calculadora.entity.Calculadora;

@Repository
public interface CalculadoraRepository extends JpaRepository<Calculadora, Long> {}
