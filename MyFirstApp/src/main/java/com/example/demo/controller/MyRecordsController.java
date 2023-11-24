package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.Records;
import com.example.demo.repository.RecordsRepository;

@Controller
public class MyRecordsController {

	@Autowired
	RecordsRepository recordsRepository;

	@RequestMapping(path = "/myrecords", method = RequestMethod.GET)
	public String recoSele(Model model) {

		List<Records> recordslist = recordsRepository.findAll();

		model.addAttribute("recordslist", recordslist);

		return "myrecords";
	}
	//新規
	
}