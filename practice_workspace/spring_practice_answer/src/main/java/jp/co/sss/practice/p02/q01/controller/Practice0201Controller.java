package jp.co.sss.practice.p02.q01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Practice0201Controller {

	//Practice-2-01
	@RequestMapping("/opening")
	public String p0201() {
		return "opening";
	} 

}
