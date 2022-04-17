package br.com.daniel.athenas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.daniel.athenas.model.Pessoa;
import br.com.daniel.athenas.repository.PessoaRepository;
import org.thymeleaf.Thymeleaf;

@RestController
@RequestMapping("/index")
public class PessoaController {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	/*
	@GetMapping("/cadastro")
    public String home(ModelMap model) {
        model.addAttribute("nomeDoAtributo", "Daniel");

        return "home";
    }
	*/
	@GetMapping("/listar")
	public List<Pessoa> listar(){
		return pessoaRepository.findAll();
	}
	
	@PostMapping("cadastrar")
	public Pessoa adicionar(@RequestBody Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	

}	
