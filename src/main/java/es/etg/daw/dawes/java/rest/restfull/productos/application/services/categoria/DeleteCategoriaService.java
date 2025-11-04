package es.etg.daw.dawes.java.rest.restfull.productos.application.services.categoria;

import es.etg.daw.dawes.java.rest.restfull.productos.application.usecase.categoria.DeleteCategoriaUseCase;
import es.etg.daw.dawes.java.rest.restfull.productos.domain.model.CategoriaId;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class DeleteCategoriaService {
    private final DeleteCategoriaUseCase deleteCategoriaUseCase;
    
    public void delete(CategoriaId id){
        deleteCategoriaUseCase.delete(id);
    }
}
