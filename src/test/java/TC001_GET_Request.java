import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class TC001_GET_Request {

	@Test
	void test1()
	{
		Response response = get("https://reqres.in/api/users?page=2");
		
		System.out.println(response.getBody().asString());
		System.out.println(response.asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());
		
		int statuscode = response.getStatusCode();
		
		Assert.assertEquals(statuscode, 200);
	}
	
	void test2()
	{
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data.id[0]",equalTo(7));
	}
	
}
