package com.vanhackthon.felipe.route;

import static spark.Spark.get;

import java.util.List;

import com.vanhackthon.felipe.domain.Agenda;
import com.vanhackthon.felipe.service.AgendaService;
import com.vanhackthon.felipe.util.JsonTransformer;

import spark.servlet.SparkApplication;

public class AgendaRoute implements SparkApplication {

	private AgendaService service;

	public AgendaRoute() {
		service = new AgendaService();
	}
	
	@Override
	public void init() {
		
		get("/agenda", (req, res) -> {
			String eventId = req.queryParams("eventId");
			
			List<Agenda> agendas = service.getAgendaOfTheEvent(Long.valueOf(eventId));
			
			if (agendas.isEmpty()) {
				res.status(404);
			}
			
			res.type("application/json");
			return agendas;
		}, new JsonTransformer());
		
	}
	
}
