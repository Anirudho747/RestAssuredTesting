import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TC006_Delete {

@Test
public void test() {
		
        
		given().
		delete("https://reqres.in/api/users/2").
		then().statusCode(204).log().all();
	}

}
