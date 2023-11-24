package com.example.demo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class sotulogController {
	//DBへ接続
	@Autowired
	JdbcTemplate jdbcTemplate;

	//最初のページ
	@RequestMapping(path = "/sotulog", method = RequestMethod.GET)
	public String login() {
		return "sotulog";
	}

	@RequestMapping(path = "/sotulog", method = RequestMethod.POST)
	public String login(String id, String pw, RedirectAttributes redirectAttributes) {

		//ページを跨ぎたい時は、
		//「redirect:/xxx」を使って移動先のGETメソッドのURLを使う。

		//変数をとってif文で比較しログインする
		//成功の場合はhomeへ、失敗の場合はngへ
		redirectAttributes.addFlashAttribute("id", id);
		redirectAttributes.addFlashAttribute("pw", pw);
		if (id.equals("kokuri") && pw.equals("1920")) {
			return "redirect:/sotuhome";
		} else {
			System.out.println("test");
			return "redirect:/sotung";
		}
	}
	////////////////////////////////////////////////////////////////////////////////////////////

	//idをsotulogからyayakuへ
//	@PostMapping("/sotulog")
//	public String processSotulogInput(String id, HttpSession session) {
//		// セッションにユーザーの入力を保存
//		session.setAttribute("id", id);
//		return "redirect:/yoyaku";
//	}

//	@GetMapping("/yoyaku")
//	public String showSotuhome(Model model, HttpSession session) {
//		// セッションからユーザーの入力を取得
//		String id = (String) session.getAttribute("id");
//		model.addAttribute("id", id);
//		return "yoyaku";
//	}

	///////////////////////////////////////////////////////////////////////////////////////////////

	//新規登録ページ
	@RequestMapping(path = "/regist2", method = RequestMethod.GET)
	public String regit() {
		return "sotusinki";
	}

	@RequestMapping(path = "/regist2", method = RequestMethod.POST)
	public String sinki(String id2, String pw2, RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("id2", id2);
		redirectAttributes.addFlashAttribute("pw2", pw2);

		jdbcTemplate.update("INSERT INTO users (user_id,user_pass,) VALUES(?,?);", id2,
				pw2,
				"",
				"");

		return "redirect:/sotusinkikanryou";
	}

	//ファイルアップロード

	//次のページに飛ぶ所

	//ホーム画面
	@RequestMapping(path = "/sotuhome", method = RequestMethod.GET)
	public String home() {
		return "sotuhome";
	}

	@RequestMapping(path = "/sotuhome", method = RequestMethod.POST)
	public String fail(MultipartFile myfile, MultipartFile newfile, String ttt, Model model,
			RedirectAttributes redirectAttributes) throws IOException {

		redirectAttributes.addFlashAttribute("ttt", ttt);
		return "sotuhome";
	}

	//NG画面
	@RequestMapping(path = "/sotung", method = RequestMethod.GET)
	public String ng() {
		return "sotung";
	}

	@RequestMapping(path = "/kurasu", method = RequestMethod.GET)
	public String kurasu() {
		return "kurasu";
	}
	
	@RequestMapping(path = "/kanrilog", method = RequestMethod.GET)
	public String kanrilog() {
		return "kanrilog";
	}

	
	//新規登録完了画面
	@RequestMapping(path = "/sotusinkikanryou", method = RequestMethod.GET)
	public String sixthsecond() {
		return "sotusinkikanryou";
	}

}