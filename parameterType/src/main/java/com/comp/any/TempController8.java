package com.comp.any;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class TempController8
{
	@RequestMapping("/temp8/{a}/{b}")
	String temp(Abc abc)
	{
		System.out.println(abc.getA());
		System.out.println(abc.getB());
		return "none";
	}


	static class Abc {
		String a;
		int b;
		@Override
		public String toString() {
			return "Abc [a=" + a + ", b=" + b + "]";
		}
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
	}
}