package com.vanhackthon.felipe;

import com.vanhackthon.felipe.route.AgendaRoute;
import com.vanhackthon.felipe.route.HelloWorldRoute;
import com.vanhackthon.felipe.route.InfoRoute;

public class App {
	public static void main(String[] args) {
		new HelloWorldRoute().init();
		new InfoRoute().init();
		new AgendaRoute().init();
	}
}

