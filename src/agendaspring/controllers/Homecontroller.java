package agendaspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller {

	
	
	
	@RequestMapping("/")
	public String homeseila() {
		
		System.out.println("chamou o metodo da home");
		return "home.jsp";
		
	}
	
	
	
}
