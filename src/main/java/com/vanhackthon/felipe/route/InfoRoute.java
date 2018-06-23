package com.vanhackthon.felipe.route;

import static spark.Spark.get;

import java.time.YearMonth;

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
			String strDate = req.queryParams("date");
			YearMonth date = strDate != null ? YearMonth.parse(strDate) : null;
			
			res.type("application/json");
			
			Info info = service.getInfo(date);
			if (info == null) {
				res.status(404);
			}
			
			return info;
		}, new JsonTransformer());
		
	}
	
}
