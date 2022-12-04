import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {
    @Test
    void shouldReturnBody() {
        // Given - When - Then

        given()
                .baseUri("https://postman-echo.com")
                .body("name")

                .when()
                .post("/post")
                .then()
                .statusCode(500)
                .body("data", equalTo("phone"))
        ;
    }
}
