package TheCatApi;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TesteVoto extends DataProvider {
	@BeforeClass
	public  static void urlraiz() {
		RestAssured.baseURI = "https://api.thecatapi.com/v1/";
	}
public String vote_id;
	@Test
	public void testeVoto() {
		Response response =  given().
				contentType("application/json").
				body(bodyVoto).
					when().
					post("votes/");
		response.then().body("message",containsString("SUCCESS")).statusCode(200);
	}

}