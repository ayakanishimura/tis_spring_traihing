package jp.co.sss.training.lesson01_07;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class SessionController3 {
	
	
	@RequestMapping(path = "/lesson01_07/login")
	public String login() {
		return "lesson01_07/login";
	}
	
	@RequestMapping(path = "/lesson01_07/login", method = RequestMethod.POST)
	public String doLogin(String userId, String password) {
		if (userId != null &&  password.length() > 0 && userId.equals(password)) {
			return "lesson01_07/success";
		} else {
			return "lesson01_07/login";
		}
	}
	
	@RequestMapping(path = "/lesson01_07/success")
	public String success() {
		return "lesson01_07/success";
	}
	
	
	

}
