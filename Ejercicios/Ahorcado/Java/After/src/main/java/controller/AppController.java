package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {

	@RequestMapping("/")
	public String home(){
		return "home";
	}
	
	@RequestMapping("/greeting")
	public String greet(@RequestParam("name")String name,ModelMap model){
		model.addAttribute("name", name);
		return "greeting";
	}
}
