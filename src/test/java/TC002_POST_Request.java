import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class TC002_POST_Request {

		
		@Test
		void post()
		{
			Map<String,Object> map = new HashMap<String,Object>();
		
			map.put("name", "Anirudh");
			map.put("job", "Automation Tester");
			
			JSONObject request = new JSONObject(map);
			
			System.out.println(request.toJSONString());
			
			JSONObject request2 = new JSONObject();
			
			request2.put("name", "Anirudh");
			request2.put("job", "Automation Tester");
			
			System.out.println(request2.toJSONString());
			
			given().
			header("Content-Type","application/json").
			accept(ContentType.JSON).
			body(request2.toJSONString()).when().post("https://reqres.in/api/users").then().statusCode(201);
		}
	}

