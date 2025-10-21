package es.etg.daw.dawes.java.rest.restfull.productos.application.usecase;

import java.time.LocalDateTime;

import es.etg.daw.dawes.java.rest.restfull.productos.application.command.EditProductoCommand;
import es.etg.daw.dawes.java.rest.restfull.productos.domain.model.Producto;
import es.etg.daw.dawes.java.rest.restfull.productos.domain.repository.ProductoRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UpdateProductoUseCase {

    private ProductoRepository productoRepository;


    public Producto update(EditProductoCommand command){

        //TODO habria que buscar primero el producto
        //TODO y luego mapeariamos los nuevos valores


        Producto producto = Producto.builder()
                                    .id(command.id())
									.nombre(command.nombre())
									.precio(command.precio())
									.createdAt(LocalDateTime.now()).build();

        productoRepository.save(producto);
        return producto;
}
}
