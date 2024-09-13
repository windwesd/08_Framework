package edu.kh.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.kh.test.dto.Student;
@Controller
public class StudentController {

	@Autowired
	@RequestMapping("select")
	@PostMapping("select")
	public String selectStudent (Model model, @ModelAttribute Student student,
			@RequestParam("stdName") String stdName,
			@RequestParam("stdAge") int stdAge,
			@RequestParam("stdAddress") String stdAddress
			) {
		model.addAttribute("stdName", student.getStdName());
		model.addAttribute("stdAge", student.getStdAge());
		model.addAttribute("stdAddress", student.getStdAddress());
		return "student/select";
	}
	
}