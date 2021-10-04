package jp.co.sss.training.lesson01_01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/lesson01_01/index")
	public String index() {
		return "lesson01_01/index";
	}

}
