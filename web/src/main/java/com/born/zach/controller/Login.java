package com.born.zach.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/index")
public class Login {
	
	
	@RequestMapping("/login.htm")
	public String login(HttpServletRequest request, Model model) {
		
		
		
		model.addAttribute("message", "success");
		return "index.jsp";
	}
}
