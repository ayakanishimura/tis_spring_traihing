package jp.co.sss.training.lesson01_08;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.training.form.LoginForm;

@Controller

public class LoginController {
	
	
	@RequestMapping(path = "/lesson01_08/login")
	public String login() {
		return "lesson01_08/login";
	}
	
	@RequestMapping(path = "/lesson01_08/login", method = RequestMethod.POST)
	public String loginForm(LoginForm form) {
		if (form.getUserId() != null &&  form.getPassword().length() > 0 && form.getUserId().equals(form.getPassword())) {
			return "lesson01_08/success";
		} else {
			return "lesson01_08/login";
		}
		
	}
	
	
	@RequestMapping(path = "/lesson01_08/success")
	public String successs() {
		return "lesson01_08/success";
	}
	
	

}
