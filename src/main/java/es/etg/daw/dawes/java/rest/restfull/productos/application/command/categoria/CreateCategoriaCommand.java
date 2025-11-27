package es.etg.daw.dawes.java.rest.restfull.productos.application.command.categoria;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Accessors;

//Esta clase tiene los datos necesarios para crear una Categoria
@Getter
@AllArgsConstructor
@Accessors(fluent = true) // Así los getters no llevan prefijo get
public class CreateCategoriaCommand {

    private String nombre;
}
