package com.comp.any;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
class TempController5 {
	@RequestMapping("/temp5")
	String temp(@RequestParam("a") String a, @RequestParam("b") int b, Model model)
	{
		System.out.println("모델 스캔 - 시작");
		Map<String, Object> map = model.asMap();
		for (String key : map.keySet())
		{
			System.out.println(key + " : " + map.get(key).toString());
		}
		System.out.println("모델 스캔 - 종료");
		return "none";
	}
}