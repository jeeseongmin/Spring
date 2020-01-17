package com.comp.any;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class TempController4 {
	@RequestMapping("/temp4")
	String temp(Abc abc)
	{
		System.out.println("a : " + abc.getA());
		System.out.println("b : " + abc.getB());
		
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