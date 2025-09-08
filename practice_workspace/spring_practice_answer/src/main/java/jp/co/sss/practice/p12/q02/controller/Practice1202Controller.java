package jp.co.sss.practice.p12.q02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Practice1202Controller {


	@RequestMapping("/checkbox/input")
	public String showCheckbox() {
		return "practice12/02/checkbox_input";
	} 
	@RequestMapping("/checkbox/result")
	public String showResult(String[] destPrefs,Model model) {
		model.addAttribute("destPrefs",destPrefs);
		return "practice12/02/result";
	} 

}
