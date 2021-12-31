package com.example.bank_demo.component;

import com.example.bank_demo.controllers.TransactionController;
import com.example.bank_demo.services.TransactionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;


@SpringBootTest
public class TransactionComponentTest {

    @Test
    public void test() {
        given().standaloneSetup(new TransactionController(new TransactionService())).
                when().get("http://localhost:8080/transactions/1").
                then().statusCode(200);
    }
}
