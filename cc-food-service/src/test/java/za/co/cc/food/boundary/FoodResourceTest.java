package za.co.cc.food.boundary;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.json.JsonObject;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import static io.restassured.RestAssured.given;
import static javax.json.Json.createObjectBuilder;

@QuarkusTest
public class FoodResourceTest {

    JsonObject foodRequest;

    @BeforeEach
    void init() {
        foodRequest = createObjectBuilder()
                .add("foodName", "Banana")
                .add("servingSize", "100")
                .add("servingUnit", "g")
                .add("calories", "91")
                .add("protein", "1.25")
                .add("carbohydrate", "18.75")
                .add("fat", "0.25")
                .add("dietaryFibre", "1.8")
                .add("sodium", "1")
                .build();
    }

    @Test
    public void testCreateFood() {
        given()
                .body(foodRequest.toString())
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON)
          .when()
                .post("/api/foods")
          .then()
             .statusCode(201);

        given()
            .when()
                .get("/api/foods")
            .then()
                .statusCode(200);
    }

    @Test
    public void testGetAllFoods() {
        given()
            .when().get("/api/foods")
            .then()
                .statusCode(200);
    }

}
