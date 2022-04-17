package br.com.daniel.athenas.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.daniel.athenas.repository.PessoaRepository;

@Controller
public class CadastroController {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@GetMapping
    public String index(ModelMap model) {
        model.addAttribute("nomeDoAtributo", "Daniel");

        return "home";
    }
	
}
