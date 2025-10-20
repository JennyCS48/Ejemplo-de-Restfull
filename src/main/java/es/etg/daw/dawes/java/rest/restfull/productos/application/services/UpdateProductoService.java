package es.etg.daw.dawes.java.rest.restfull.productos.application.services;

import org.springframework.stereotype.Service;

import es.etg.daw.dawes.java.rest.restfull.productos.application.command.EditProductoCommand;
import es.etg.daw.dawes.java.rest.restfull.productos.application.usecase.UpdateProductoUseCase;
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
