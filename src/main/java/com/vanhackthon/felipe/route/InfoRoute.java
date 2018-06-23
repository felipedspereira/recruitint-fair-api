package com.vanhackthon.felipe.route;

import static spark.Spark.get;

import com.vanhackthon.felipe.domain.Info;
import com.vanhackthon.felipe.service.InfoService;
import com.vanhackthon.felipe.util.JsonTransformer;

import spark.servlet.SparkApplication;

public class InfoRoute implements SparkApplication {

	private InfoService service;

	public InfoRoute() {
		service = new InfoService();
	}
	
	@Override
	public void init() {
		
		get("/info", (req, res) -> {
			String eventDate = req.queryParams("date");
			
			Info info = service.getInfo(eventDate);
			
			if (info == null) {
				res.status(404);
			}
			
			res.type("application/json");
			return info;
		}, new JsonTransformer());
		
	}
	
}
