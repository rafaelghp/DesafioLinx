package TheCatApi;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestCadastro extends DataProvider {
	@BeforeClass
	public  static void urlraiz() {
		RestAssured.baseURI = "https://api.thecatapi.com/v1/";
	}

	@Test
	public void testeCadastro() {
		Response response =  given().
				contentType("application/json").
				body(bodyCadastro).
				when().
				post(urlCadastro);
		response.then().body("message",containsString("SUCCESS")).statusCode(200);
	}
}