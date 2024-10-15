package edu.kh.project.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 요청 응답을 제어하는 Controller 역할 명시 + Bean 등록
public class MainController {

	@RequestMapping("/")
	public String mainPage() {
		
		
		
		return "common/main";
	}
}
