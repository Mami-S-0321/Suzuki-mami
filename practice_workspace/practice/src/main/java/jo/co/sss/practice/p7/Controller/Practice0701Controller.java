package jo.co.sss.practice.p7.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jo.co.sss.practice.p7.repository.AreaRepository;

@Controller
public class Practice0701Controller {
	@Autowired
	AreaRepository repository;
	
	@RequestMapping("/fruits/area/list/all")
	public String showAreaList(Model model) {
		model.addAttribute("areas",repository.findAll());
		return "practice7-01/fruits_list";
	}

}
