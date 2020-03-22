package com.example.demo;

import java.io.Serializable;

public class Name implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	private int nameNumn;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNameNumn() {
		return nameNumn;
	}

	public void setNameNumn(int nameNumn) {
		this.nameNumn = nameNumn;
	}
}
