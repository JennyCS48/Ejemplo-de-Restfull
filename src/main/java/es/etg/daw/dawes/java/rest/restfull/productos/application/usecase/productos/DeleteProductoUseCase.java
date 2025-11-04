package es.etg.daw.dawes.java.rest.restfull.productos.application.usecase.productos;

import es.etg.daw.dawes.java.rest.restfull.productos.domain.repository.ProductoRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DeleteProductoUseCase {

    private ProductoRepository productoRepository;

    public void delete(int id) {

        // TODO en un futuro alguien lo borrará

        productoRepository.deteteById(id);
    }

}
