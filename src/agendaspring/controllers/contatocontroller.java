package agendaspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import agenda.daos.ContatoDAO;
import agenda.models.Contato;

@Controller
public class contatocontroller {
@RequestMapping("contatos/form")
	public String form() {
System.out.println("chamou o fomr de contatos");
	return "contatos/form";
	}
	
@PostMapping("/contatos")
	public String adicionar(Contato contato) {
		System.out.println("chamou os contatos");
		ContatoDAO dao = new ContatoDAO();
		dao.inserir(contato);
		return "contatos/ok";
		
	}

@GetMapping("/contatos")
	public ModelAndView listar() {
	
	ContatoDAO contatoDAO = new ContatoDAO();
	List<Contato> lista = ContatoDAO.getLista();
	ModelAndView model = new ModelAndView("contatos/lista");
	model.addObjects("contatos ", lista);	
	return model;
	
}
	
	
	
	
	
}
