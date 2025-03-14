package com.exampel.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApiTest {
    @Test
    public void testGetUser() {
        Response response = RestAssured.given()
                .queryParam("id", "123")
                .when()
                .get("http://localhost:8080/user");

        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertTrue(response.getBody().asString().contains("John Doe"));
    }
}
