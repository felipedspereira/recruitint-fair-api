package com.vanhackthon.felipe.route;

import org.junit.Test;

import com.vanhackthon.felipe.BaseTest;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class InfoRouteTest extends BaseTest {

	@Override
	public void init() {
		new InfoRoute().init();
	}

	@Test
	public void shouldReturnAnEvent() {
		given()
			.queryParam("date", "2018-06")
		.when()
			.get("/info")
		.then()
			.assertThat()
				.statusCode(200)
			.and()
				.body("name", equalTo("São Paulo Recruiting Fair 2.0"));
	}
	
	@Test
	public void shouldNotFindAnEventForTheSpecifiedDate() {
		given()
			.queryParam("date", "2010-01") // no event on this date
		.when()
			.get("/info")
		.then()
			.assertThat().statusCode(404);
	}
	
}
