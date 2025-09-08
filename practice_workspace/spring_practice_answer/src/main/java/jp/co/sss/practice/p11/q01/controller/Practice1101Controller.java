package jp.co.sss.practice.p11.q01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Practice1101Controller {


	@RequestMapping("/filter/def")
	public String showFilterView() {
		return "practice11/01/filter_view";
	} 

	@RequestMapping("/filter/xyz")
	public String showAfterRedirect() {
		return "practice11/01/filter_redirect";
	} 
}
