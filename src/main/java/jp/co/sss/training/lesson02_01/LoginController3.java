package jp.co.sss.training.lesson02_01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.training.form.LoginForm;

@Controller

public class LoginController3 {

	@RequestMapping("/lesson02_01/login")
	public String login() {
		return "lesson02_01/login";
	}

	@RequestMapping(path = "/lesson02_01/login", method = RequestMethod.POST)
	public String doLogin(LoginForm form, Model model) {
		if (form.getUserId() != null && form.getPassword().length() > 0
				&& form.getUserId().equals(form.getPassword())) {
			model.addAttribute("userinfo", repository.findAll());
			return "lesson02_01/succsess";
		} else {
			return "lesson02_01/login";
		}
	}

}
