package jo.co.sss.practice.p7.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jo.co.sss.practice.p7.repository.AreaRepository;
import jo.co.sss.practice.p7.repository.FruitsAreaRepository;

@Controller
public class Practice0702Controller {
	@Autowired
	FruitsAreaRepository fruitsarearepository;
	@Autowired
	AreaRepository arearepository;
	
/*	@RequestMapping("/fruits/select/area")
	public String showAreaList(Model model) {
		model.addAttribute("area",arearepository.findAll());
		return "practice07/02/area_select";*/

}
