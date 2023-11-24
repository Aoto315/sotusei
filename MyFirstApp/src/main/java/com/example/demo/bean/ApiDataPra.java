package com.example.demo.bean;

public class ApiDataPra {
	String apiKey;
	

	public ApiDataPra() {
	}

	//コンストラクタ。
	//この部分がJsonデータの中身になる。
	//例えば↓の例で言うと、
	//{message:あいうえお}みたいなデータになる。
	public ApiDataPra(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
}
