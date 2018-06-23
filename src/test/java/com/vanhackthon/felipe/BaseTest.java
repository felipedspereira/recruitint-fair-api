package com.vanhackthon.felipe;

import static spark.Spark.stop;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import io.restassured.RestAssured;

public abstract class BaseTest {

	public BaseTest() {
		init();
	}
	
	@BeforeClass
	public static void setup() {
		RestAssured.port = 4567;
	}
	
	@AfterClass
    public static void tearDown() throws Exception {
		stop();
	}
	
	public abstract void init();
	
}
