package com.vanhackthon.felipe.dao;

import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.vanhackthon.felipe.domain.Info;

public class InfoDAO {
	
	// Just mocking the database
	private List<Info> infos = new ArrayList<>();
	
	public InfoDAO() {
		
		// Populating the mocked database with data
		Info info = new Info();
		info.setEventDate(YearMonth.now());
		info.setLocation("São Paulo Center");
		info.setName("São Paulo Recruiting Fair 2.0");
		
		infos.add(info);
	}
	
	public Info getInfoByDate(YearMonth eventDate) {
		Optional<Info> infoFromDB = infos.stream()
			.filter(info -> info.getEventDate().equals(eventDate))
			.findFirst();
		
		return infoFromDB.orElseGet(() -> null);
	}
}
