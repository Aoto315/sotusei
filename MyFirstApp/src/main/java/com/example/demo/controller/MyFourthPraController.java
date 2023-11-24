package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyFourthPraController {

	@RequestMapping(path = "/fourthpra", method = RequestMethod.GET)
	public String third() {

		return "myfourthpra";
	}

	@RequestMapping(path = "/fourthpra", method = RequestMethod.POST)
	public String third(String name1, String name2) {

		System.out.println(name1);
		System.out.println(name2);

		return "myfourthpra";
	}

}






