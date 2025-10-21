package es.etg.daw.dawes.java.rest.restfull.productos.application.usecase;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import es.etg.daw.dawes.java.rest.restfull.productos.domain.model.Producto;
import es.etg.daw.dawes.java.rest.restfull.productos.domain.repository.ProductoRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
public class FindProductoUseCase {

private ProductoRepository productoRepository;


 public List<Producto> findAll(){
        //TODO Habría que implementarlo con un acceso real a los datos. 
        // lo vamos a simular
        List<Producto> lista = new ArrayList<>();
       
        return lista = productoRepository.getAll();

    }
}
