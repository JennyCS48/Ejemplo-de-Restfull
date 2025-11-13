package es.etg.daw.dawes.java.rest.restfull.productos.infraestructure.web.dto.producto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ProductoResponse (int id, String nombre, double precio, @JsonProperty("date") LocalDateTime createdAt, int categoria){

}
