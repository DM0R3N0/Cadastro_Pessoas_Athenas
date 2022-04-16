package br.com.daniel.athenas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.daniel.athenas.model.Pessoa;
import br.com.daniel.athenas.repository.PessoaRepository;

@RestController
@RequestMapping("/index")
public class Teste {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@GetMapping
	public String listar(){
		return "Metodo GET" ;
	}
	
	@PostMapping
	public String listar2(){
		return "Metodo POST" ;
	}
}	
