package jp.co.sss.practice.p06.q02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sss.practice.p06.repository.FruitsSeasonRepository;

// Practice6-01
@Controller
public class Practice0602Controller {

	@Autowired
	FruitsSeasonRepository fruitRepository;

	@RequestMapping("/fruits/list/sort/season")
	public String showFruitsListSortBySeason(Model model) {

		model.addAttribute("fruitsList", fruitRepository.findAllByOrderBySeasonMonth());
		return "practice06/02/fruits_list";

	}
}
