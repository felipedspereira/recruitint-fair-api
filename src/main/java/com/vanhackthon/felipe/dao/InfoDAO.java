package com.vanhackthon.felipe.dao;

import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.vanhackthon.felipe.domain.Info;

public class InfoDAO {
	private List<Info> infos = new ArrayList<>();
	
	public InfoDAO() {
		Info info = new Info();
		info.setDate(YearMonth.now());
		info.setLocation("São Paulo Center");
		info.setName("São Paulo Recruiting Fair 2.0");
		
		infos.add(info);
	}
	
	public Info getInfoByDate(YearMonth date) {
		Optional<Info> infoFromDB = infos.stream()
			.filter(info -> info.getDate().equals(date))
			.findFirst();
		
		return infoFromDB.orElseGet(() -> null);
	}
}
