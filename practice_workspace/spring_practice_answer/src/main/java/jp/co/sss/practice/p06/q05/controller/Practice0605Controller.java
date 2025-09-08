package jp.co.sss.practice.p06.q05.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.practice.p06.bean.FruitsSeasonBean;
import jp.co.sss.practice.p06.entity.FruitsSeason;
import jp.co.sss.practice.p06.form.FruitsSeasonForm;
import jp.co.sss.practice.p06.repository.FruitsSeasonRepository;

@Controller
public class Practice0605Controller {

	@Autowired
	FruitsSeasonRepository fruitRepository;

	// Practice6-05
	@RequestMapping("/fruits/add/input")
	public String showFruitInput() {

		return "practice06/05/fruit_input";

	}

	// Practice6-05
	@RequestMapping(path="/fruits/add/complete",method=RequestMethod.POST)
	public String registerFruit(FruitsSeasonForm fruitForm,Model model) {

		FruitsSeason fruit = new FruitsSeason();
		BeanUtils.copyProperties(fruitForm, fruit);
		fruit = fruitRepository.save(fruit);
		

		FruitsSeasonBean fruitBean = new FruitsSeasonBean();
		BeanUtils.copyProperties(fruit, fruitBean);

		model.addAttribute("fruit", fruitBean);


		return "practice06/05/fruit_detail";

	}


}
