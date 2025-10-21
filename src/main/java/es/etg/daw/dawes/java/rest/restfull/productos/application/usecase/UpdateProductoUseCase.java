package es.etg.daw.dawes.java.rest.restfull.productos.application.usecase;

import java.time.LocalDateTime;

import es.etg.daw.dawes.java.rest.restfull.productos.application.command.EditProductoCommand;
import es.etg.daw.dawes.java.rest.restfull.productos.domain.error.ProductoNotFoundException;
import es.etg.daw.dawes.java.rest.restfull.productos.domain.model.Producto;
import es.etg.daw.dawes.java.rest.restfull.productos.domain.repository.ProductoRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UpdateProductoUseCase {

    private ProductoRepository productoRepository;

    public Producto update(EditProductoCommand command) {

        // TODO habria que buscar primero el producto
        // TODO y luego mapeariamos los nuevos valores

        return productoRepository.getById(command.id())
                .map(p -> { // Actualizamos los atributos del objeto
                    p.setNombre(command.nombre());
                    p.setPrecio(command.precio());
                    return productoRepository.save(p);
                })
                .orElseThrow(() -> new ProductoNotFoundException(command.id()));

    }
}
