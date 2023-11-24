package com.example.demo.controller;

import java.io.IOException;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
@Controller
public class MyLoginController {
	//DBへ接続
	@Autowired
	JdbcTemplate jdbcTemplate;

	//最初のページ
	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String login(String id, String pw, RedirectAttributes redirectAttributes) {

		//ページを跨ぎたい時は、
		//「redirect:/xxx」を使って移動先のGETメソッドのURLを使う。

		//変数をとってif文で比較しログインする
		//成功の場合はhomeへ、失敗の場合はngへ
		redirectAttributes.addFlashAttribute("id", id);
		redirectAttributes.addFlashAttribute("pw", pw);
		if (id.equals("kokuri") && pw.equals("1920")) {
			return "redirect:/home";
		} else {
			System.out.println("test");
			return "redirect:/ng";
		}
	}

	//新規登録ページ
	@RequestMapping(path = "/regist", method = RequestMethod.GET)
	public String regit() {
		return "sinki";
	}

	@RequestMapping(path = "/regist", method = RequestMethod.POST)
	public String sinki(String id2, String pw2, RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("id2", id2);
		redirectAttributes.addFlashAttribute("pw2", pw2);

		jdbcTemplate.update("INSERT INTO users (user_id,user_pass,user_name,user_image) VALUES(?,?,?,?);", id2,
				pw2,
				"",
				"");

		return "redirect:/sinkikanryou";
	}

	//ファイルアップロード
	
	//次のページに飛ぶ所
	
	//ホーム画面
	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String home() {
		return "home";
	}

	
	@RequestMapping(path = "/home", method = RequestMethod.POST)
	public String fail(MultipartFile myfile, MultipartFile newfile,String ttt, Model model,RedirectAttributes redirectAttributes) throws IOException {

		//アップロードされたファイルをバイトデータに変換する。
		byte[] byteData = myfile.getBytes();
		byte[] byteData2 = newfile.getBytes();


		//Base64に変換する。
		String encodedImage = Base64.getEncoder().encodeToString(byteData);
		String encodedImage2 = Base64.getEncoder().encodeToString(byteData2);
		
	
		//Base64に変換した画像データをmodelに格納する。
		model.addAttribute("encodedImage", encodedImage);
		model.addAttribute("encodedImage2", encodedImage2);

		redirectAttributes.addFlashAttribute("ttt", ttt);
			return "home";
		}
	

	//NG画面
	@RequestMapping(path = "/ng", method = RequestMethod.GET)
	public String ng() {
		return "ng";
	}

	//新規登録完了画面
	@RequestMapping(path = "/sinkikanryou", method = RequestMethod.GET)
	public String sixthsecond() {
		return "sinkikanryou";
	}

	
}