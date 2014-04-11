package controller;

import model.Account;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {

	private static Account userServices = new Account();

	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/create")
	public String create() {
		return "create";
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String create(@RequestParam("user") String user, @RequestParam("password") String password,ModelMap model) {
		String return_code=userServices.create(user, password);
		model.addAttribute("message", return_code);
		return "create";
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("user") String user, @RequestParam("password") String password, ModelMap model) {
		boolean validUser = userServices.logIn(user, password);
		if (validUser) {
			return "redirect:/restricted-page";
		} else {
			model.addAttribute("message", "Access Denied");
			return "login";
		}
	}

	@RequestMapping("/restricted-page")
	public String restrictedpage() {
		return "restricted-page";
	}

}
