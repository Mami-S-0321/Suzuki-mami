package jp.co.sss.practice.p06.q03.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sss.practice.p06.bean.FruitsSeasonBean;
import jp.co.sss.practice.p06.entity.FruitsSeason;
import jp.co.sss.practice.p06.repository.FruitsSeasonRepository;

@Controller
public class Practice0603Controller {

	@Autowired
	FruitsSeasonRepository fruitRepository;


	// Practice6-03
	@RequestMapping("/fruits/list/sort/id")
	public String showFruitsListSortById(Model model) {

		model.addAttribute("fruitsList", fruitRepository.findAllByOrderByFruitId());
		return "practice06/03/fruits_list";

	}
	// Practice6-03
	@RequestMapping("/fruits/detail/{fruitId}")
	public String showFruitDetail(@PathVariable Integer fruitId,Model model) {
		
		FruitsSeason fruit = fruitRepository.getReferenceById(fruitId);
		FruitsSeasonBean fruitBean = new FruitsSeasonBean();
		BeanUtils.copyProperties(fruit, fruitBean);

		model.addAttribute("fruit", fruitBean);
		return "practice06/03/fruit_detail";

	}

}
