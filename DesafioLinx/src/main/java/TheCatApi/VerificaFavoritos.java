package TheCatApi;

import static io.restassured.RestAssured.given;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class VerificaFavoritos extends DataProvider {
	@BeforeClass
	public static void urlraiz() {
		RestAssured.baseURI = "https://api.thecatapi.com/v1/";
	}

	public String ids;

	@Test
	public void verifica() {

		Response response = given().contentType("application/json")
				.header("x-api-key", "b8c86eec-35dc-4761-8287-0de7d0aa30fe").
				when().
				get(urlFavorito);
			response.then().statusCode(200);
		ids = response.body().jsonPath().getString("id");
		Assert.assertEquals(ids, idFavorito);
	}

	@Test
	public void verificaNegativo() {

		Response response = given().contentType("application/json")
				.header("x-api-key", "b8c86eec-35dc-4761-8287-0de7d0aa30fe").
				when().
				get(urlFavorito);
		ids = response.body().jsonPath().getString("id");
		Assert.assertNotEquals(ids, idNaofavorito);
	}
	@Test
	public void verificaFavoritoSemApiKey() {
		Response response = given().contentType("application/json").
				when().
				get(urlFavorito);
			response.then().statusCode(401);
	}
}
