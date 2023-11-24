package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoshuController {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	//INSERT（登録）用メソッド
	@RequestMapping(path = "/boshu", method = RequestMethod.GET)
	public String postIns() {

		return "boshu";
	}
	
	//INSERT（登録）用メソッド
	@RequestMapping(path = "/boshu", method = RequestMethod.POST)
	public String postIns(String time, String place, String money) {

		jdbcTemplate.update("INSERT INTO gero VALUES (?,?,?);", time, place, money);

		return "redirect:/boshu";
	}
}