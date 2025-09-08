package jp.co.sss.practice.p04.q01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Practice0401Controller {

	// Practice4-01 入力画面表示用
	@RequestMapping("/input")
	public String showInputPage() {
		return "practice04/01/input_form";
	}

	// Practice4-01 GETでのパラメータ取得
	@RequestMapping("/send/get_method")
	public String getResult(String color) {
		System.out.println("##GETメソッドで受け取りました");
		System.out.println("##パラメータの値:" + color);
		return "practice04/01/get_result";
	}

	// Practice4-01 POSTでのパラメータ取得
	@RequestMapping(path = "/send/post_method", method = RequestMethod.POST)
	public String postResult(String color) {
		System.out.println("==POSTメソッドで受け取りました");
		System.out.println("==パラメータの値:" + color);
		return "practice04/01/post_result";
	}


}
