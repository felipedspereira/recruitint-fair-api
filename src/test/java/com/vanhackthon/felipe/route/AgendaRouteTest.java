package com.vanhackthon.felipe.route;
import org.junit.Test;

import com.vanhackthon.felipe.BaseTest;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class AgendaRouteTest extends BaseTest {

	@Override
	public void init() {
		new AgendaRoute().init();
	}

	@Test
	public void shouldReturnAnAgendaForTheSpecifiedEvent() {
		given()
			.queryParam("eventId", 10l)
		.when()
			.get("/agenda")
		.then()
			.assertThat()
				.statusCode(200)
			.and()
				.body("first().name", equalTo("Registration"))
			.and()
				.body("[1].name", equalTo("Company Presentations"));
	}
	
	@Test
	public void shouldNotFindAnAgendaForTheSpecifiedEvent() {
		given()
			.queryParam("eventId", 123l) // no event with this Id
		.when()
			.get("/agenda")
		.then()
			.assertThat().statusCode(404);
	}
	
}
