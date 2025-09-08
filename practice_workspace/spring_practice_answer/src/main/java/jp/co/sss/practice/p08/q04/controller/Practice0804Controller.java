package jp.co.sss.practice.p08.q04.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sss.practice.p08.repository.FruitsShopItemRepository;

@Controller
public class Practice0804Controller {

	@Autowired
	FruitsShopItemRepository itemRepository;


	// Practice8-04
	@RequestMapping("/fruits_shop/type/sort/bycount")
	public String showTypeListSortByCount(Model model) {

		model.addAttribute("typeList", itemRepository.findQueryByTypeSortByTypeCount());
		return "practice08/04/type_list";

	}

}
