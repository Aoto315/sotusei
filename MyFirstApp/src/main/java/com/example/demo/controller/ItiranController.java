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
public class ItiranController {
	@Autowired
	JdbcTemplate jdbcTemplate;

	
	@RequestMapping(path = "/itiran", method = RequestMethod.GET)
	public String postIns(Model model) {
		List<Map<String, Object>> selectList;
		//SELECT文の実行
		selectList = jdbcTemplate.queryForList("select * from gero;");
		//実行結果をmodelにしまってHTMLで出せるようにする。
		model.addAttribute("gerolist", selectList);
		
		System.out.println(selectList.size());
			
		return "itiran";
	}
	
	//一覧表示用
	@RequestMapping(path = "/itiran", method = RequestMethod.POST)
	public String viewIns(Model model) {
		
		List<Map<String, Object>> selectList;
		//SELECT文の実行
		selectList = jdbcTemplate.queryForList("select * from gero;");
		//実行結果をmodelにしまってHTMLで出せるようにする。
		model.addAttribute("gerolist", selectList);
		return "itiran";
	}
}