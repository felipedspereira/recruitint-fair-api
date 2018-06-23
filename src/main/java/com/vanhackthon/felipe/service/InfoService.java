package com.vanhackthon.felipe.service;

import java.time.YearMonth;

import com.vanhackthon.felipe.dao.InfoDAO;
import com.vanhackthon.felipe.domain.Info;

public class InfoService {

	private InfoDAO dao;
	
	public InfoService() {
		dao = new InfoDAO();
	}
	
	public Info getInfo(YearMonth date) {
		return dao.getInfoByDate(date);
	}
	
}
