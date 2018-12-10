package agendaspring.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import agenda.daos.ContatoDAO;
import agenda.models.Contato;

@Controller
@RequestMapping("/contatos")
public class contatocontroller {
	@RequestMapping("/form")
	public String form() {
		System.out.println("Chamou o form de contatos");
		return "contatos/form";
	}
	
	@PostMapping                                 
	public String adicionar(Contato contato) {
		System.out.println(contato);
		ContatoDAO contatoDAO = new ContatoDAO();
		contatoDAO.inserir(contato);
		
		return "redirect:contatos" ;
		//sempre que fizer um post fazer um redirecionamento do post
	}
	
	@GetMapping
	public ModelAndView listar() {
		ContatoDAO contatoDAO = new ContatoDAO();
		List<Contato> lista = contatoDAO.getLista();
		ModelAndView model = new ModelAndView("contatos/lista");
		model.addObject("contatos", lista);
		return model;
	
	}
	
	@RequestMapping("/remover")
	public ModelAndView remover(Contato contato) {
		System.out.println("chamou o metodo de remover");
		ContatoDAO contatoDAO = new ContatoDAO();
		contatoDAO.remover(contato);
		
		return listar();
		
		
	}
	
}