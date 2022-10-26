package org.example;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.BeforeAll;

public class Specifications {

    static RequestSpecification request;


    public static RequestSpecification requestSpecification(){
        request= new RequestSpecBuilder()
                .setBaseUri("https://www.anapioficeandfire.com/")
                .setContentType("application/json")
                .build();
        return request;
    }
    static ResponseSpecification response;
    public static ResponseSpecification responseSpecification (){
        response= new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();
        return response;
    }

}
