package ahorcado.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ahorcado.model.Juego;

@Controller
public class JuegoController {

	@RequestMapping("/")
	public String home(){
		return "home";
	}
	
	@RequestMapping("/jugar")
	public String jugar(@RequestParam("palabra")String palabra, ModelMap model){
		Juego juego=new Juego();
		String secuencia=juego.getSecuencia(palabra);
		model.addAttribute("secuencia",secuencia);
		return "jugar";
	}
}
