package Ip.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/product")
public class Product {
	@RequestMapping(value="list", method = RequestMethod.GET)
	public String list(ModelMap modelMap) {
		modelMap.put("title", "Categary product");
		return "product.list";
	}
	@RequestMapping(value="special", method = RequestMethod.GET)
	public String special(ModelMap modelMap) {
		modelMap.put("title", "Special product");
		return "product.special";
	}
}
