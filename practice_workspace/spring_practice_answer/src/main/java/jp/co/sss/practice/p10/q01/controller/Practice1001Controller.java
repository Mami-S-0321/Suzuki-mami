package jp.co.sss.practice.p10.q01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;
import jp.co.sss.practice.p10.q01.form.PersonalInfoForm;

@Controller
public class Practice1001Controller {

	@RequestMapping("/personal_info/input")
	public String showPersonalInfoInput(@ModelAttribute PersonalInfoForm personalInfoForm) {
		return "practice10/01/info_input";
	}
	
	@RequestMapping("/personal_info/check")
	public String checkInputValue(@Valid @ModelAttribute PersonalInfoForm personalInfoForm,BindingResult result) {
		if(result.hasErrors()) {
			return "practice10/01/info_input";
		}
		return "practice10/01/input_ok";
	}

}
