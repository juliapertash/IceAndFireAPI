package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.*;

public class GeneralTest {
    @Test
    public void generalPageTest(){
        General generalObj =given()
                .when()
                .spec(Specifications.requestSpecification())
                .get("api/")
                .then()
                .spec(Specifications.responseSpecification())
                .log().all()
                .extract().body().jsonPath().getObject("", General.class);
        Assertions.assertTrue(generalObj.getBooks().startsWith("https"));




    }


}
