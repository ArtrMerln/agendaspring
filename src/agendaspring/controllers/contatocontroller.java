package agendaspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import agenda.daos.ContatoDAO;
import agenda.models.Contato;

@Controller
public class contatocontroller {
@RequestMapping("contatos/form")
	public String form() {
System.out.println("chamou o fomr de contatos");
	return "contatos/form";
	}
	
@RequestMapping("/contatos")
	public String adicionar(Contato contato) {
		System.out.println("chamou os contatos");
		ContatoDAO dao = new ContatoDAO();
		dao.inserir(contato);
		return "contatos/ok";
		
	}
	
	
	
	
	
	
}
