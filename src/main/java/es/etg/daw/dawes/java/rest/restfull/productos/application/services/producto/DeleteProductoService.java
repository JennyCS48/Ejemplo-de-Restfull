package es.etg.daw.dawes.java.rest.restfull.productos.application.services.producto;

import org.springframework.stereotype.Service;

import es.etg.daw.dawes.java.rest.restfull.productos.application.usecase.productos.DeleteProductoUseCase;
import es.etg.daw.dawes.java.rest.restfull.productos.domain.model.ProductoId;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class DeleteProductoService {
 private final DeleteProductoUseCase deleteProductoUseCase;
    
    public void delete(ProductoId id){
        deleteProductoUseCase.delete(id);
    }

}
