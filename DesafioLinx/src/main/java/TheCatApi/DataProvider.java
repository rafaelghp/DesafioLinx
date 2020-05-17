package TheCatApi;

public class DataProvider {

	public String urlCadastro = "user/passwordlesssignup";
	public String bodyCadastro = "{\"email\": \"rafaelghp1@gmail.com\", \"appDescription\": \"testelinx\"}";
	public String urlFavorito = "favourites/";
	public String bodyFavorito = "{\"image_id\": \"271\"}";
	public String bodyVoto = "{\"image_id\": \"KCJeb66J2\", \"value\": \"true\", \"sub_id\": \"demo-a24afc\"}";
	public String bodyDesfavorita = "favourites/{favourite_id}";
	public String idFavorito = "[2019650, 2019656, 2019657]";
	public String idNaofavorito = "0000000";
}
