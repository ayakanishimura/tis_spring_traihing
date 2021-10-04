package jp.co.sss.training.lesson01_06;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SessionController2 {
	
	@RequestMapping(path = "/lesson01_06/postForm")
	public String postForm() {
		return "lesson01_06/postForm";
		
		// returnの"/lesson01_06"/あるとデプロイ時にエラー
	}

	@RequestMapping(path = "/lesson01_06/post", method = RequestMethod.POST)
	public String post(String text) {
		System.out.println("入力されたテキスト：" + text);
		return "lesson01_06/postForm";
	}
	
	
	

}
