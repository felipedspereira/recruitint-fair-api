package com.vanhackthon.felipe.route;

import org.junit.Test;

import com.vanhackthon.felipe.BaseTest;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class InfoTest extends BaseTest {

	@Override
	public void init() {
		new Info().init();
	}

	@Test
	public void shouldReturnAnEvent() {
		given()
			.queryParam("date", "06-2018")
		.when()
			.get("/info")
		.then()
			.assertThat()
				.statusCode(200)
			.and()
				.body("name", equalTo("Recruting Fair 2.0"));
	}
	
	@Test
	public void shouldNotFindAnEventForTheSpecifiedDate() {
		given()
			.queryParam("date", "01-2010") // no event on this date
		.when()
			.get("/info")
		.then()
			.assertThat().statusCode(404);
		
	}
	
}
