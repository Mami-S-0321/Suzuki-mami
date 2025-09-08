package jo.co.sss.practice.p2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Practice0201Controller {
	@RequestMapping(path = "/opening")
	public String index() {
		return "Practice2-01/opening";
	}
	@RequestMapping(path = "/")
	public String index2() {
		return "Practice2-01/index";
	}

}
