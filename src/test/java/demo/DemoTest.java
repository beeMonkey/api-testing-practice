package demo;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class DemoTest {
    @Test
    public void first_time_test_tencent(){
            given().
                    when().log().all().
                    get("http://www.tencent.com").
                    then().log().all().
                    assertThat().
                    statusCode(200).
                    and().
                    contentType(ContentType.HTML);

        }
}
