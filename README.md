# DesafioLinx

Para o desafio decidi utilizar a linguagem Java para programação, utilizando o mavem como gerenciador de projeto e os frameworks Junit 4.12 e RestAssured 4.0

Para  que o projeto rode é preciso configurar estar com o Java8  e adicionar as dependencias  tanto do Junit quanto do RestAssured no Pom.xml : 

<dependencies>
		<dependency>
			<groupId>io.rest-assured</groupId>
			<artifactId>rest-assured</artifactId>
			<version>4.0.0</version>
		</dependency>
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.12</version>
		</dependency>
  
  
  Escolhi utilizar a api public The cat api para realização dos testes : https://thecatapi.com/
  Esta api se trata basicamente de uma aplicação onde votamos em fotos de gatos, ou até mesmo favoritando elas. 
  
  O primeiro teste a ser realizado, seria o teste de cadastro da api, onde colocamos um e-mail e descrição da aplicação utilizada  e a partir disto recebemos um email com uma chave de api: 
  Senario de teste:
    Dado que preenchi o e-mail e app description corretamente 
    Quando clico em signup 
    então recebo um email com a api key 
    
    Dado que prencho o body corretamente 
    quando envio um post para a url correta
    então retorna status code 200
  
  
  O Segundo Teste Consiste em realizar uma votação na foto de um gato.
  Senario de Teste
  Dado que estou na pagina de votação 
  Quando clico em love it ou nope it 
  Então meu voto é registrado 
  
  dado que preenchi o body corretamente 
  quando realizo um posto para a url correta
  então retorna status code 200 
  
  O terceiro teste consiste em favoritar e depois desfavoritar a foto de um gato, este teste exige que possua uma API key.
  
  Teste Senario 
  
  Dado que estou na pagina de votação de 
  quando clico em fav-it 
  então a foto é favoritada 
  
  Dado que estou em uma foto favoritada 
  quando clico em un-fav-it
  Então a foto é desfavoritada
  
  Dado que possuo uma api key e preenchi o body corretamente 
  quando  envio um post para a url correta
  então retorna status code 200 e o id é salvo 
  
  dado que possuo uma api key e possuo o id de uma foto favoritada e preenchi o body corretamente 
  quando envio um delet para a url correta
  então retorna status code 200
  
  o Quarto teste consiste em  verificar as fotos que foram validadas , este teste precisa da API key. 
  
  dado que possuo uma api key e preenchi o body corretamente 
  quando envio um get para a url correta 
  então recebo status 200 e recebo os ids das fotos favoritadas. 
  
  o quinto teste se trata de comparar um id que não esta salvo nos meus favoritos 
 
 dado que possuo uma api key e que preenchi o body corretamente e que consulto um id que não esta na pesquisa 
 quando envio um get para a url correta 
 então retorna status code 200.
 
 o sexto teste consiste em tentar verificar as fotos favoritas sem uma api key  
 
 dado que não possuo uma api key e preenchi o body corretamente 
 quando envio um get para a url correta 
 então retorna status code 401;
