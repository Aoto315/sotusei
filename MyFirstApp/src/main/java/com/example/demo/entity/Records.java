package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//↓「name="xxx"」の「xxx」の部分に模倣したいテーブル名を書く
@Table(name = "records")
public class Records {

	//主キーには「@Id」を設定する！
	@Id
	//カラム名(列名)を書く。
	@Column(name = "user_id")
	private int user_id;

	@Column(name = "user_name")
	private String user_name;

	@Column(name = "game_count")
	private String game_count;

	@Column(name = "win")
	private String win;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setItem_pass(String user_name) {
		this.user_name = user_name;
	}

	public String getGame_count() {
		return game_count;
	}

	public void setGame_count(String game_count) {
		this.game_count = game_count;
	}

	public String getWin() {
		return win;
	}

	public void setWin(String win) {
		this.win = win;
	}

}









