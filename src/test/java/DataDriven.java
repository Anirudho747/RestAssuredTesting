import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DataDriven extends DataForTests{
	
	

	@Test(dataProvider ="anyName")
	void post(String fname,String lname)
	{
		JSONObject request2 = new JSONObject();
		
		request2.put("name",fname);
		request2.put("job", lname);
		
		System.out.println(request2.toJSONString());
		
		given().
		header("Content-Type","application/json").
		accept(ContentType.JSON).
		body(request2.toJSONString()).when().post("https://reqres.in/api/users").then().statusCode(201).log().all();
	}

}
