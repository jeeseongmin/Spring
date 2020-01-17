package com.oper.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.oper.app.service.UserListResponseDTO;
import com.oper.app.service.UserListServiceImpl;

@Controller
public class MainController {
	@Autowired
	UserListServiceImpl userListService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(ModelAndView mv) {
		// Service call//

		List<UserListResponseDTO> userlist = userListService.getUserListService();

		for (int i = 0; i < userlist.size(); i++) {
			System.out.println("name: " + userlist.get(i).getUserName());
		}

		mv.addObject("listuser", userlist);
		mv.setViewName("mainview");

		return mv;
	}
}
