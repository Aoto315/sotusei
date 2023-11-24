package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TrainingController {
	//DBへつなぐために必要
	@Autowired
	JdbcTemplate jdbcTemplate;

	//練習問題①
	//URLが「/practice1」の時に「practice1.html」を表示させる。
	@RequestMapping(path = "/practice1", method = RequestMethod.GET)
	public String one() {
		return "practice1";
	}

	//練習問題②
	//URLが「/practice2」の時に「practice2.html」を表示させる。
	//practice2.htmlは2つの入力欄「ID」「PW」を持ち、
	//Controllerではこれを受け取ってSysout表示させる。
	//尚URLはGETもPOSTも「/practice2」とする。
	@RequestMapping(path = "/practice2", method = RequestMethod.GET)
	public String twoGet() {
		return "practice2";
	}

	@RequestMapping(path = "/practice2", method = RequestMethod.POST)
	public String twoPost(String ID,String PW ,RedirectAttributes redirectAttributes) {
		
		redirectAttributes.addFlashAttribute("ID", ID);
		redirectAttributes.addFlashAttribute("PW", PW);
		
		return "redirect:/practice2";
	}
	
	//練習問題③
	//URLが「/practice3」の時に「practice3.html」を表示させる。
	//practice3.htmlはチェックボックスの入力欄「曜日」を持つ。
	//曜日は月曜日～金曜日までの5つあり、チェックされた項目を
	//Controllerで受け取り、Sysout表示した後、
	//チェックした内容をhtmlに表示させる事。
	//尚URLはGETもPOSTも「/practice3」とする。
	@RequestMapping(path = "/practice3", method = RequestMethod.GET)
	public String threeGet() {
		return "practice3";
	}

	@RequestMapping(path = "/practice3", method = RequestMethod.POST)
	public String threePost(String[] youbi,Model model) {
		
		for (int i = 0; i < youbi.length; i++) {
			System.out.println("曜日:" + youbi[i]);
		}
		model.addAttribute("youbilist", youbi);
		
		return "practice3";
	}
	
	//練習問題④
	//URLが「/practice4」の時に「practice4.html」を表示させる。
	//ControllerのGETメソッドでusersテーブルに対して全件検索を行い、
	//htmlではその内容を画面表示させる事（プリント使うと良いかも？）
	@RequestMapping(path = "/practice4", method = RequestMethod.GET)
	public String fourGet() {
		
		return "practice4";
	}
}