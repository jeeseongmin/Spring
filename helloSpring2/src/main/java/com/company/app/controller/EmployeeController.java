package com.company.app.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company.app.service.EmployeeManager;
 
@Controller
//   /employee/getAllEmployees
@RequestMapping("/employee")
public class EmployeeController 
{
    @Autowired
    EmployeeManager manager;
 
    @RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
    public String getAllEmployees(Model model)
    {
    	model.addAttribute("employees", manager.getAllEmployees());
    	return "employeesListDisplay";
    }
    
    
    // /employee/test
    @RequestMapping(value = "/test", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		//logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home2";
	}
}