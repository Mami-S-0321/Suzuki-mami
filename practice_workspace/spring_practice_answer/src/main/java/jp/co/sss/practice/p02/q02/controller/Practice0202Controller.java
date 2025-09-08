package jp.co.sss.practice.p02.q02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Practice0202Controller {

	//Practice-2-02
	@RequestMapping("/hello/world")
	public String p0202() {
		return "hello";
	} 

}
