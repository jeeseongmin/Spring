package com.comp.any;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
class TempController3 {
	@RequestMapping( "/temp3")
	String temp(@RequestParam("a") String a, @RequestParam("b") int b)
	{
		System.out.println("a : " + a);
		// Integer.parseInt() 과정이 필요없다!
		System.out.println("b : " + b);

		return "none";
	}
}