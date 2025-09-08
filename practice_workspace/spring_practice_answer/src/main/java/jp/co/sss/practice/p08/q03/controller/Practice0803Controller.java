package jp.co.sss.practice.p08.q03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sss.practice.p08.entity.Type;
import jp.co.sss.practice.p08.repository.FruitsShopItemRepository;
import jp.co.sss.practice.p08.repository.TypeRepository;

@Controller
public class Practice0803Controller {

	@Autowired
	FruitsShopItemRepository itemRepository;

	@Autowired
	TypeRepository typeRepository;
	

	// Practice8-03
	@RequestMapping("/fruits_shop/query/input")
	public String showSearchInput(Model model) {

		model.addAttribute("typeList", typeRepository.findAll());
		return "practice08/03/search_input";

	}

	// Practice8-03
	@RequestMapping("/fruits_shop/query/result")
	public String showSearchResult(Integer minPrice,Integer maxPrice,Integer typeId,Model model) {
		
		Type type = new Type();
		type.setTypeId(typeId);

		model.addAttribute("itemsList",itemRepository.findQueryByPriceRangeAndType(minPrice,maxPrice,type));

		return "practice08/03/items_list";

	}

}
