//package com.example.demo.controller;
//
//import java.util.Random;
//
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.bean.ApiData;
//import com.example.demo.bean.ApiDataPra;
//
//@RestController
//public class MyApiController {
//
//	@PostMapping("/api")
//	@CrossOrigin(origins = "*")
//	public ApiData postApidata(@RequestBody ApiData apiData) {
//		//変数「apiData」に受信したデータが格納されている。
//
//		//apiDataからmessageを取り出し。
//		String jusinMessage = apiData.getMessage();
//
//		//HTMLに返すデータ。
//		return new ApiData("HTML→Spring(ここで作った文章です): " + apiData.getMessage(), 0);
//	}
//
//	//慣れよう問題用
//	@PostMapping("/apinare")
//	@CrossOrigin(origins = "*")
//	public ApiData postApidatanare(@RequestBody ApiData apiData) {
//		//変数「apiData」に受信したデータ（Json）が格納されている。
//		//apiDataからmessageを取り出し。
//		String jusinMessage = apiData.getMessage();
//
//		//apiDataからquantityを取り出してみよう。
//		int jusinQuantity = apiData.getQuantity();
//
//		//取り出したmessageとquantityをHTMLに帰してみよう。
//		return new ApiData("復習問題です。: " + apiData.getMessage(), apiData.getQuantity());
//	}
//
//	//練習問題用
//		@PostMapping("/apiPra")
//		@CrossOrigin(origins = "*")
//		public ApiDataPra postApidataPra(@RequestBody ApiDataPra apiData) {
//			//変数「apiData」に受信したデータ（Json）が格納されている。
//	
//			//受信データからAPIキーを取得
//			String jusinApiKey = apiData.getApiKey();
//	
//			//取得したAPIキーが正しい「kokuri1920」かどうかによって返すメセージを変える。
//			String returnMoji = "";
//			if ("kokuri1920".equals(jusinApiKey)) {
//				returnMoji = "正しいAPIキーが入力されました。開発者情報にアクセスが出来ます。";
//			} else {
//				returnMoji = "間違ったAPIキーです。サービス提供者にAPIキーを問い合わせてください。";
//			}
//	
//			//取り出したmessageとquantityをHTMLに帰してみよう。
//			return new ApiDataPra("問い合わせの結果は…:" + returnMoji);
//		}
//
//	///////早めに終わった人向け//////
//		@PostMapping("/apiGacha")
//		@CrossOrigin(origins = "*")
//		public Gacha postApidataGacha() {
//
//			/**
//			 * プログラムを以下のような仕様に変更してみよう。
//			 * 提供割合を
//			 * 30%・・・・沼田先生（SR）
//			 * 40%・・・・渡部（R）
//			 * 20%・・・・小野先生(SR)
//			 * 9%・・・・末原先生(SR)
//			 * 1%・・・・竹野谷先生(SSR)
//			 * になるようにする。
//			 * 名前、画像、レアリティを画面に表示させる。
//			 * 
//			 * それも出来たら・・・。
//			 * 10連ガチャを実装してみよう。
//			 * ヒント：配列を上手く使う事！！
//			 */
//			//1-100のランダムな数値を生成し、変数「ransu」に格納する。
//			Random rnd = new Random();
//			int ransu = rnd.nextInt(100) + 1;
//
//			//return用の変数
//			String name = "";
//			String rarerity = "";
//			String imgUrl = "";
//			//100%沼田先生が出る。神様のような仕様
//			if (ransu < 29 && ransu > 0) {
//				name = "沼田先生";
//				rarerity = "SR";
//				imgUrl = "https://www.itc.ac.jp/_cms/wp-content/themes/itc1.1.0/assets/img/teacher/img-teacher-numata-s-on.jpg";
//			}
//			if (ransu < 69 && ransu > 30) {
//				name = "渡部先生";
//				rarerity = "R";
//				imgUrl = "https://www.itc.ac.jp/_cms/wp-content/themes/itc1.1.0/assets/img/teacher/img-teacher-watabe-m-on.jpg";
//			}
//			if (ransu < 89 && ransu > 70) {
//				name = "小野先生";
//				rarerity = "SR";
//				imgUrl = "https://www.itc.ac.jp/_cms/wp-content/themes/itc1.1.0/assets/img/teacher/img-teacher-ono-k-on.jpg";
//			}
//			if (ransu < 99 && ransu > 90) {
//				name = "末原先生";
//				rarerity = "SR";
//				imgUrl = "https://www.itc.ac.jp/_cms/wp-content/themes/itc1.1.0/assets/img/teacher/img-teacher-suehara-a-on.jpg";
//			}
//			if (ransu < 101 && ransu > 99) {
//				name = "竹野谷先生";
//				rarerity = "SSR";
//				imgUrl = "https://www.itc.ac.jp/_cms/wp-content/themes/itc1.1.0/assets/img/teacher/img-teacher-takenoya-y-on.jpg";
//			}
//			return new Gacha(name, rarerity, imgUrl);
//	
//	}
//}