package br.com.indra.test.cenarios;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.RestAssured;

public class APIFilmes {
	
	
	public void teste_get_filmes() {
	
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";		
    	
        given()
   	 .when()
   	   .get("/todos/1")
   	 .then()
   	   .statusCode(200);
	
	}

}
