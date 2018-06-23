package com.vanhackthon.felipe.service;

import java.util.List;

import com.vanhackthon.felipe.dao.AgendaDAO;
import com.vanhackthon.felipe.domain.Agenda;

public class AgendaService {

	private AgendaDAO dao;
	
	public AgendaService() {
		dao = new AgendaDAO();
	}
	
	public List<Agenda> getAgendaOfTheEvent(Long eventId) {
		return dao.getAgendaById(eventId);
	}
	
}
