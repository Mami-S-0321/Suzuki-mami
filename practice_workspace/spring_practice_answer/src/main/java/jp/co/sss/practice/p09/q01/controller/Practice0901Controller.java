package jp.co.sss.practice.p09.q01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;
import jp.co.sss.practice.p09.q01.form.BodyTempForm;

@Controller
public class Practice0901Controller {

	@RequestMapping("/body_temp/input")
	public String showBodyTempInput(@ModelAttribute BodyTempForm bodyTempForm) {
		return "practice09/01/bt_input";
	}
	
	@RequestMapping("/body_temp/check")
	public String checkInputValue(@Valid @ModelAttribute BodyTempForm bodyTempForm,BindingResult result) {
		if(result.hasErrors()) {
			//入力チェックでエラーあり
			return "practice09/01/bt_input";
		}
		Double bt =bodyTempForm.getBodyTemp();
		if(35.0 < bt && bt < 37.5 ) {
			//体温正常範囲内
			return "practice09/01/bt_ok";
		}else {
			//体温正常範囲外
			return "practice09/01/bt_ng";
		}
	}

}
