package jp.co.sss.training.lesson01_05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SessionController {
	
	@RequestMapping(path = "/lesson01_05/getForm", method = RequestMethod.GET)
	public String getForm() {
		return "lesson01_05/getForm";
	}

	@RequestMapping(path = "/lesson01_05/form", method = RequestMethod.GET)
	public String form(String text) {
		System.out.println("入力されたテキスト：" + text);
		return "lesson01_05/getForm";
	}
}
