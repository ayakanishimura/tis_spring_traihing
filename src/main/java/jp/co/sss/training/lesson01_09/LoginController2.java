package jp.co.sss.training.lesson01_09;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.training.form.LoginForm;

@Controller

public class LoginController2 {
	
	
	@RequestMapping(path = "/lesson01_09/login")
	public String login() {
		return "lesson01_09/login";
	}
	
	@RequestMapping(path = "/lesson01_09/login", method = RequestMethod.POST)
	public String formLogin(LoginForm form, HttpSession session) {
		if (form.getUserId() != null &&  form.getPassword().length() > 0 &&  form.getUserId().equals( form.getPassword())) {
			session.setAttribute("userId", form.getUserId());
			return "lesson01_09/success";
	} else {
			return "lesson01_09/login";
	}
	
	}
	
	
	@RequestMapping(path = "/lesson01_09/success")
	public String success() {
		return "lesson01_09/success";
	}
	
	
	@RequestMapping(path = "/lesson01_09/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/lesson01_09/login";
	}
	

}
