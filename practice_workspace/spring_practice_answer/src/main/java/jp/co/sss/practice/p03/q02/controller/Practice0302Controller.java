package jp.co.sss.practice.p03.q02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Practice0302Controller {


	//Practice03-02 最初の画面表示用
	@RequestMapping("/show/redirect_page")
	public String showRedirectPage() {
		return "practice03/02/redirect_link";
	}
	//Practice03-02 絶対パスリダイレクト処理用
	@RequestMapping("/absolute")
	public String redirectAbsolutePath() {
		return "redirect:https://www.google.co.jp/";
	}
	//Practice03-02 絶対パスリダイレクト処理用
	@RequestMapping("/relative")
	public String redirectRelativePath() {
		return "redirect:/result";
	}
	//Practice03-02リダイレクト先の画面表示用
	@RequestMapping("/result")
	public String redirectResult() {
		return "practice03/02/redirect_result";
	}

}
