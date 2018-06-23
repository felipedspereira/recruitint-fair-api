package com.vanhackthon.felipe.dao;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.vanhackthon.felipe.domain.Agenda;

public class AgendaDAO {
	
	// Just mocking the database
	private List<Agenda> agendas = new ArrayList<>();
	
	public AgendaDAO() {
		
//		// Populating the mocked database with data
		Agenda agenda = new Agenda();
		agenda.setEventId(10l);
		agenda.setName("Registration");
		agenda.setTime(LocalDateTime.of(2018, 6, 23, 7, 0));
		
		Agenda agenda1 = new Agenda();
		agenda1.setEventId(10l);
		agenda1.setName("Company Presentations");
		agenda1.setTime(LocalDateTime.of(2018, 6, 23, 9, 0));
		
		Agenda agenda2 = new Agenda();
		agenda2.setEventId(10l);
		agenda2.setName("Ongoing: Interviews & Coding Challenge");
		agenda2.setTime(LocalDateTime.of(2018, 6, 23, 10, 0));
		
		agendas.add(agenda);
		agendas.add(agenda1);
		agendas.add(agenda2);
	}
	
	public List<Agenda> getAgendaById(Long eventId) {
		return agendas.stream()
			.filter(agenda -> agenda.getEventId().equals(eventId))
			.collect(Collectors.toList());
	}
}
