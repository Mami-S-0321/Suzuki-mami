package jp.co.sss.practice.p03.q01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Practice0301Controller {

	//Practice03-01 最初の画面表示用
	@RequestMapping("/first")
	public String first() {
		return "practice03/01/before_redirect";
	}
	//Practice03-01 リダイレクト処理用
	@RequestMapping("/second")
	public String second() {
		return "redirect:/third";
	}
	//Practice03-01 リダイレクト先の画面表示用
	@RequestMapping("/third")
	public String third() {
		return "practice03/01/after_redirect";
	}
}
