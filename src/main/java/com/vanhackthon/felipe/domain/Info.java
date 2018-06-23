package com.vanhackthon.felipe.domain;

import java.time.YearMonth;

public class Info {
	private YearMonth date;
	private String name;
	private String location;

	public YearMonth getDate() {
		return date;
	}

	public void setDate(YearMonth date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
