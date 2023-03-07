package com.dev.practica7cli.dto;

import lombok.Getter;
import lombok.Setter;

public class RestauranteDTO {
	
	@Getter @Setter
	private Long idRestaurante;
	@Getter @Setter
	private String nombre;
	@Getter @Setter
	private String direccion;
	@Getter @Setter
	private String slogan;
	
	
	@Override
	public String toString() {
		return "RestauranteDTO [idRestaurante=" + idRestaurante + ", nombre=" + nombre + ", direccion=" + direccion
				+ ", slogan=" + slogan + "]";
	}
	
	
}
