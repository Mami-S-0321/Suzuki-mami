package jp.co.sss.practice.p08.q02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jp.co.sss.practice.p08.entity.Type;
import jp.co.sss.practice.p08.repository.TypeRepository;

@Controller
public class Practice0802Controller {

	@Autowired
	TypeRepository typeRepository;
	
	@Autowired
	EntityManager entityManager;

	// Practice8-02
	@RequestMapping("/fruits_shop/named/input")
	public String showSearchInput(Model model) {

		model.addAttribute("typeList", typeRepository.findAll());
		return "practice08/02/search_input";

	}

	// Practice8-02
	@RequestMapping("/fruits_shop/named/result")
	public String showSearchResult(Integer minPrice,Integer maxPrice,Integer typeId,Model model) {
		
		Type type = new Type();
		type.setTypeId(typeId);
		
		Query query = entityManager.createNamedQuery("findNamedQueryByPriceRangeAndType");
		query.setParameter("min",minPrice);
		query.setParameter("max",maxPrice);
		query.setParameter("type",type);
		model.addAttribute("itemsList",query.getResultList());

		return "practice08/02/items_list";

	}

}
