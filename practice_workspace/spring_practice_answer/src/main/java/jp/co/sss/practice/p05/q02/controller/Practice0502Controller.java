package jp.co.sss.practice.p05.q02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class Practice0502Controller {

	//Practice5-02 数あてゲーム開始画面表示
	@RequestMapping("/numguess/start")
	public String showNumguessStart(HttpSession session) {
		Integer hitNumber = (int) (Math.floor(Math.random() * 9)+1);
		System.out.println("当たりの値:"+hitNumber);

		session.setAttribute("hitNumber", hitNumber);
		return "practice05/02/numguess_start";
	}

	//Practice5-02 数あてゲーム入力画面表示
	@RequestMapping("/numguess/input")
	public String showNumguessInput() {
		return "practice05/02/numguess_input";
	}

	//Practice5-02 数あてゲーム入力受付、当たり判定処理
	@RequestMapping("/numguess/judge")
	public String showNumguessJudge(HttpSession session, Integer inputNum) {
		Integer hitNumber = (Integer) session.getAttribute("hitNumber");
		if (inputNum == hitNumber) {
			return "redirect:/numguess/hit";
		}
		return "practice05/02/numguess_judge";
		
	}
	//Practice5-02 数あてゲーム終了受付処理
	@RequestMapping("/numguess/hit")
	public String endNumguess(Model model,HttpSession session) {
		Integer hitNumber = (Integer) session.getAttribute("hitNumber");
		String message ="当たり！正解は"+hitNumber+"です。";

		session.removeAttribute("hitNumber");
		model.addAttribute("message",message);
		return "practice05/02/numguess_end";
		
	}

}
