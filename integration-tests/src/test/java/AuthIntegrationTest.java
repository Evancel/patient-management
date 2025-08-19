import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class AuthIntegrationTest {
    @BeforeAll
    static void setUp() {
        //the address of our API-GATEWAY
        RestAssured.baseURI = "http://localhost:4004";
    }

    @Test
    public void shouldReturnOKWithValidToken() {
        //1. arrange: set up
        //2. act
        //3. assert

        String loginPayLoad = """
                   {
                       "email":"testuser@test.com",
                       "password":"password123"
                   }
                """;

        Response response = given()        //arrange
                .contentType("application/json")
                .body(loginPayLoad)

                .when()                    //act
                .post("/auth/login")

                .then()                    //assert
                .statusCode(200)
                .body("token", notNullValue())

                .extract()                 //generate response
                .response();

        System.out.println("Generated Token: " + response.jsonPath().getString("token"));
    }

    @Test
    public void shouldReturnUnauthorizedOnInvalidToken() {
        //1. arrange: set up
        //2. act
        //3. assert

        String loginPayLoad = """
                   {
                       "email":"invalid_user@test.com",
                       "password":"wrongpassword"
                   }
                """;

        given()                                     //arrange
                .contentType("application/json")
                .body(loginPayLoad)

                .when()                             //act
                .post("/auth/login")

                .then()                             //assert
                .statusCode(401);
    }
}
