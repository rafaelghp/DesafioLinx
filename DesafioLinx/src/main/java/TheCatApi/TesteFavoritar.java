package TheCatApi;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TesteFavoritar extends DataProvider{
	
	@BeforeClass
	public  static void urlraiz() {
		RestAssured.baseURI = "https://api.thecatapi.com/v1/";
	}
	
	public String favorite_id;
	
	
	public void favoritar() {
		Response response = given().contentType("application/json").
				header("x-api-key","b8c86eec-35dc-4761-8287-0de7d0aa30fe").
				body(bodyFavorito).
				when().
				post(urlFavorito);
		response.then().statusCode(200).body("message", containsString("SUCCESS"));
		String id = response.jsonPath().getString("id");
		favorite_id=id;
		
		
	}
	
	
	public void  desfavoritar() {
		Response response = given().contentType("application/json").
				header("x-api-key","b8c86eec-35dc-4761-8287-0de7d0aa30fe").
				pathParam("favourite_id", favorite_id).
				when().delete(bodyDesfavorita);
			response.then().statusCode(200).body("message", containsString("SUCCESS"));
			
	}
	@Test
	public void testeDesfavorita() {
		favoritar();
		desfavoritar();
	}
	
	
	
}
