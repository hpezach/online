package com.born.zach.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Login {
	
	
	@RequestMapping("/login.htm")
	public String login(HttpServletRequest request, Model model) {
		String userName = request.getParameter("name");
		model.addAttribute("userName", userName);
		model.addAttribute("message", "success");
		return "home.jsp";
	}
}
