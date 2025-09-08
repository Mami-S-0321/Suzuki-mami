package jp.co.sss.practice.p06.q01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sss.practice.p06.repository.FruitsSeasonRepository;

// Practice6-01
@Controller
public class Practice0601Controller {

	@Autowired
	FruitsSeasonRepository fruitRepository;

	@RequestMapping("/fruits/list/all")
	public String showFruitsList(Model model) {

		model.addAttribute("fruitsList", fruitRepository.findAll());
		return "practice06/01/fruits_list";

	}
}
