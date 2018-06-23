package com.vanhackthon.felipe.domain;

import java.time.LocalDateTime;

public class Agenda {
	private LocalDateTime time;
	private String name;
	private Long eventId;

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

}
