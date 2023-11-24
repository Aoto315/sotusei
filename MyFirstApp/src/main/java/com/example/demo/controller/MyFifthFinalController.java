package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyFifthFinalController {

	@RequestMapping(path = "/fifthfinal", method = RequestMethod.GET)
	public String fifth() {

		return "myfifthfinal";
	}

	@RequestMapping(path = "/fifthfinal", method = RequestMethod.POST)
	public String fifth(String[] sushi,
			Model model) {

		/**
		 * 画面から入力された内容をSysout
		 */

		//好きな食べ物を表示
		for (int i = 0; i < sushi.length; i++) {
			System.out.println("好きな寿司:" + sushi[i]);
		}

		/**
		 * HTMLで表示するために、modelに格納する。
		 */

		model.addAttribute("sushilist", sushi);
		return "myfifthfinal";
	}
}
