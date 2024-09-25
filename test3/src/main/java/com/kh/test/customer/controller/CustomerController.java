package com.kh.test.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.test.customer.service.CustomerService;

@Controller 
@RequestMapping("customer") 
public class CustomerController {

  @Autowired 
  private CustomerService service;

  @PostMapping("deleteCustomer")
	public String deleteCustomer(@RequestParam("customerNo") int customerNo, Model model) {
		
		
		int result = service.deleteCustomer(customerNo);
		if(result > 0)	model.addAttribute("message", "삭제 성공!!!");
		else 			model.addAttribute("message", "회원 번호가 일치하는 회원이 없습니다");
		return "result";
	}


}
