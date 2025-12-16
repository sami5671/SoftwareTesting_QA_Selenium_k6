package rest_assured_demo_sessions;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
import org.testng.annotations.Test.*;

public class Get_Request_Demo {
	
	@Test
	public void get_request_demo() {
		given().when().get("https://reqres.in/api/users").then().statusCode(200).log().all().extract().response();
	}

}
