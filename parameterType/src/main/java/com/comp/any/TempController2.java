package com.comp.any;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
class TempController2 {
	@RequestMapping("/temp2")
	String temp(@RequestParam Map<String, String> param)
	{
		String a = param.get("a");
		String b = param.get("b");

		System.out.println("a : " + a);
		System.out.println("b : " + b);

		return "none";
	}
}