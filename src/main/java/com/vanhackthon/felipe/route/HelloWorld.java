package com.vanhackthon.felipe.route;

import static spark.Spark.*;

import com.vanhackthon.felipe.service.HelloWorldService;

import spark.servlet.SparkApplication;

public class HelloWorld implements SparkApplication {

	private HelloWorldService service;

	public HelloWorld() {
		service = new HelloWorldService();
	}

	@Override
	public void init() {
		get("/hello", (req, res) -> {
			return service.helloWorld();
		});
	}
}
