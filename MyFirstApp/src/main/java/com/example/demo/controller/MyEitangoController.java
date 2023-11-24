package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyEitangoController {

	@Autowired
	JdbcTemplate jdbcTemplate;

	//一覧表示用
	@RequestMapping(path = "/myeitango", method = RequestMethod.GET)
	public String viewPage(Model model) {

		List<Map<String, Object>> resultList;
		resultList = jdbcTemplate.queryForList("SELECT * FROM eitango;");

		model.addAttribute("tangoList", resultList);

		return "myeitango";
	}

	//INSERT（登録）用メソッド
	@RequestMapping(path = "/myeitangoIns", method = RequestMethod.POST)
	public String postIns(String eng, String jpn) {

		jdbcTemplate.update("INSERT INTO eitango VALUES (?,?);", eng, jpn);

		return "redirect:/myeitango";
	}

	//更新（更新）用メソッド
	@RequestMapping(path = "/myeitangoUpd", method = RequestMethod.POST)
	public String postUpd(String eng, String jpn) {

		jdbcTemplate.update("UPDATE eitango SET jpn = ? WHERE eng = ?", jpn, eng);

		return "redirect:/myeitango";
	}

	//追加問題用
	@RequestMapping(path = "/myeitangoSr", method = RequestMethod.POST)
	public String postUpd(String jpn, Model model) {

		/**
		 * 冊子のModel,form,DB操作を参考にしてみよう。
		 */
		List<Map<String, Object>> resultList;
		resultList = jdbcTemplate.queryForList("SELECT * FROM eitango WHERE jpn = ?;", jpn);

		model.addAttribute("tangoList", resultList);

		return "myeitango";
	}
}