package com.vanhackthon.felipe;

import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

import com.vanhackthon.felipe.route.HelloWorld;

public class HelloWorldTest extends BaseTest {

	@Override
	public void init() {
		new HelloWorld().init();
	}
	
	@Test
	public void shouldReturnHelloWorld() {
		get("/hello")
		.then()
			.assertThat()
				.body(equalTo("Hello World"));
	}
}
