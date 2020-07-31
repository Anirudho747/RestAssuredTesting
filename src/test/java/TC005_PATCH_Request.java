import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TC005_PATCH_Request {

	@Test
	public void test() {
		
        JSONObject request = new JSONObject();
		
		System.out.println(request.toJSONString());
		
		JSONObject request2 = new JSONObject();
		
		request2.put("name", "Anirudh");
		request2.put("job", "Automation Tester");
		
		System.out.println(request2.toJSONString());
		
		given().
		header("Content-Type","application/json").
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		patch("https://reqres.in/api/users/2").
		then().statusCode(200).log().all();
	}

}
