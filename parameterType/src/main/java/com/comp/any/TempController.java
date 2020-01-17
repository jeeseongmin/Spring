package com.comp.any;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class TempController
{
	@RequestMapping("/temp")
	String temp(HttpServletRequest request)
	{
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);

		return "none";
	}
}