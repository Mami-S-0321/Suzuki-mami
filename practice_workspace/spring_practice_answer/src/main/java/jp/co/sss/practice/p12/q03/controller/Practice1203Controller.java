package jp.co.sss.practice.p12.q03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Practice1203Controller {

	@RequestMapping("/layout/first")
	public String showLayoutFirst() {
		return "practice12/03/first";
	}
	@RequestMapping("/layout/second")
	public String showLayoutSecond() {
		return "practice12/03/second";
	}
	@RequestMapping("/layout/third")
	public String showLayoutThird() {
		return "practice12/03/third";
	}
}
