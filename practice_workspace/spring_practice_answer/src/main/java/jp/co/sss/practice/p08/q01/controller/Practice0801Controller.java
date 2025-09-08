package jp.co.sss.practice.p08.q01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sss.practice.p08.repository.FruitsShopItemRepository;

@Controller
public class Practice0801Controller {

	@Autowired
	FruitsShopItemRepository itemRepository;

	// Practice8-01
	@RequestMapping("/fruits_shop")
	public String showFruitsShopItemsList(Model model) {

		model.addAttribute("itemsList", itemRepository.findAll());
		return "practice08/01/items_list";

	}


}
