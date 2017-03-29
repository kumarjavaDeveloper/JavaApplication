package Ip.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/account")
public class Account {
	@RequestMapping(value="myaccount", method = RequestMethod.GET)
	public String account(ModelMap modelMap) {
		modelMap.put("title", "My Account");
		return "account.myaccount";
	}
	@RequestMapping(value="register", method = RequestMethod.GET)
	public String register(ModelMap modelMap) {
		modelMap.put("title", "Register");
		return "account.register";
	}
}
