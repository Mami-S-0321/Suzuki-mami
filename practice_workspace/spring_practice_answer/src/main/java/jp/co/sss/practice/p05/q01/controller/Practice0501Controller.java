package jp.co.sss.practice.p05.q01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.practice.p05.q01.form.BmiForm;

@Controller
public class Practice0501Controller {

	// Practice5-01 入力画面表示用
	@RequestMapping("/bmi/input")
	public String showBmiInputPage() {
		return "practice05/01/bmi_input";
	}

	// Practice5-01 POSTでのパラメータ取得、BMIの計算
	@RequestMapping(path = "/bmi/result", method = RequestMethod.POST)
	public String calcBmiResult(BmiForm bmiForm, Model model) {

		Double weight = bmiForm.getWeight();
		Double height = bmiForm.getHeight() / 100;
		bmiForm.setBmi(weight / ((height) * (height)));
		model.addAttribute("bmiForm", bmiForm);

		return "practice05/01/bmi_result";
	}


}
