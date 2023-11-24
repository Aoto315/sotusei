package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//↓「name="xxx"」の「xxx」の部分に模倣したいテーブル名を書く
@Table(name = "messages")
public class Messages {

	//主キーには「@Id」を設定する！
	@Id
	//カラム名(列名)を書く。
	@Column(name = "message_id")
	private int message_id;

	@Column(name = "origmessage")
	private String origmessage;

	@Column(name = "convmessage")
	private String convmessage;

	
	public int getMessage_id() {
		return message_id;
	}

	public void setItem_id(int message_id) {
		this.message_id = message_id;
	}

	public String getOrigmessage() {
		return origmessage;
	}

	public void setItem_pass(String origmessage) {
		this.origmessage = origmessage;
	}

	public String getConvmessage() {
		return convmessage;
	}

	public void setItem_name(String convmessage) {
		this.convmessage = convmessage;
	}

	

}









