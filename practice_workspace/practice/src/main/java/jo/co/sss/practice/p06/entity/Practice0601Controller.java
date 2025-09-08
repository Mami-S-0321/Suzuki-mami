package jo.co.sss.practice.p06.entity;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Practice0601Controller {
//	@Autowired
//	FruitsSeasonRepository repository;

	@RequestMapping("/fruits/list/all")
	public String fruitslist(){
		return "opening";
	}

}
