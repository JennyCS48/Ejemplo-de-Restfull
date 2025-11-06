package es.etg.daw.dawes.java.rest.restfull.productos.infraestructure.db.repository.mock.categoria;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import es.etg.daw.dawes.java.rest.restfull.productos.domain.model.CategoriaId;
import es.etg.daw.dawes.java.rest.restfull.productos.domain.model.Categoria;

public class CategoriaFactory {
    public static final Map<CategoriaId, Categoria> getDemoData(){
        Map<CategoriaId, Categoria> datos = new LinkedHashMap<>();

        datos.put(new CategoriaId(1), new Categoria(new CategoriaId(1), "Nombre categoria 1", LocalDateTime.now()));
        datos.put(new CategoriaId(2), new Categoria(new CategoriaId(2), "Nombre categoria 2", LocalDateTime.now()));
        datos.put(new CategoriaId(3), new Categoria(new CategoriaId(3), "Nombre categoria 3", LocalDateTime.now()));
        datos.put(new CategoriaId(4), new Categoria(new CategoriaId(4), "Nombre categoria 4", LocalDateTime.now()));
        
        return datos;
    }
}
