package es.etg.daw.dawes.java.rest.restfull.productos.application.services.producto;

import org.springframework.stereotype.Service;

import es.etg.daw.dawes.java.rest.restfull.productos.application.command.productos.EditProductoCommand;
import es.etg.daw.dawes.java.rest.restfull.productos.application.usecase.productos.UpdateProductoUseCase;
import es.etg.daw.dawes.java.rest.restfull.productos.domain.model.Producto;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UpdateProductoService {

    private final UpdateProductoUseCase updateProductoUseCase;
    
    public Producto update(EditProductoCommand command){
        return updateProductoUseCase.update(command);
    }
}
