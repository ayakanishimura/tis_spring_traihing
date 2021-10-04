package jp.co.sss.training.lesson01_03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class FowardController {
	
	
	@RequestMapping("/lesson01_03/before")
	public String before() {
		return "/lesson01_03/before";
	}
	
	@RequestMapping("/lesson01_03/redirect")
	public String after() {
		return "redirect:/lesson01_02/foward";
	}
	
  

	
	

}
