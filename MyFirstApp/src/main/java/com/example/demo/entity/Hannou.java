package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//↓「name="xxx"」の「xxx」の部分に模倣したいテーブル名を書く
@Table(name = "hannou")
public class Hannou {

	//主キーには「@Id」を設定する！
	@Id
	//カラム名(列名)を書く。
	@Column(name = "data_id")
	private int data__id;

	@Column(name = "category")
	private String category;

	@Column(name = "user_name")
	private int user_name;

	@Column(name = "time")
	private int time;
	
	public int getDate_id() {
		return data__id;
	}

	public void setData_id(int data__id) {
		this.data__id= data__id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getUser_name(){
		return user_name;
	}

	public void setUser_name(int user_name) {
		this.user_name = user_name;
	}
	
	public int getTime(){
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
}