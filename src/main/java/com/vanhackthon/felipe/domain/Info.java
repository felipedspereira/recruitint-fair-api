package com.vanhackthon.felipe.domain;

import java.time.YearMonth;

public class Info {
	private YearMonth eventDate;
	private String name;
	private String location;

	public YearMonth getEventDate() {
		return eventDate;
	}

	public void setEventDate(YearMonth date) {
		this.eventDate = date;
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
