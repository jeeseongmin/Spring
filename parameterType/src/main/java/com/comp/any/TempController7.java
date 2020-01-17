package com.comp.any;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class TempController7 {
	@RequestMapping("/temp7/{a}/{b}")
	String temp(@PathVariable("a") String a, @PathVariable("b") int b)
	{
		System.out.println(a);
		System.out.println(b);
		return "none";
	}
}