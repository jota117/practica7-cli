package com.dev.practica7cli.client;

import java.util.Iterator;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.dev.practica7cli.dto.RestauranteDTO;

public class RestaurantesWSClient {
	
	public static void main(String[] args) {
		
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target("http://localhost:8080/practica7-ws/dev/restauranteWS").path("consultarRestaurantes");
		
		Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
		Response response = invocationBuilder.get();
		
		if (response.getStatus() == 204) {
			System.out.println("No se encontraron los Restaurantes");
		}
		if (response.getStatus() == 200) {
			
			List<RestauranteDTO> restDTO = response.readEntity( new GenericType<List<RestauranteDTO>>() {} );
			
			for (Iterator iterator = restDTO.iterator(); iterator.hasNext();) {
				RestauranteDTO restauranteDTO = (RestauranteDTO) iterator.next();
				
				System.out.println(restauranteDTO.toString());
				
			}
			
			
		}
		
	}
		

}
