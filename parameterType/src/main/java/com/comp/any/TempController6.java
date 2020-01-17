package com.comp.any;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TempController6 {
	@RequestMapping("/temp6")
	String temp(Abc abc, Model model)
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
	static public class Abc
	{
		@Override
		public String toString() {
			return "Abc [a=" + a + ", b=" + b + "]";
		}
		String a;
		public String getA() {
			return a;
		}
		public void setA(String a) {
			this.a = a;
		}
		public int getB() {
			return b;
		}
		public void setB(int b) {
			this.b = b;
		}
		int b;
	}
}
