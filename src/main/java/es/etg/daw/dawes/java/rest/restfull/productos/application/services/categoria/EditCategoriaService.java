package es.etg.daw.dawes.java.rest.restfull.productos.application.services.categoria;

import es.etg.daw.dawes.java.rest.restfull.productos.application.command.categoria.EditCategoriaCommand;
import es.etg.daw.dawes.java.rest.restfull.productos.application.usecase.categoria.EditCategoriaUseCase;
import es.etg.daw.dawes.java.rest.restfull.productos.domain.model.Categoria;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class EditCategoriaService {
    private final EditCategoriaUseCase editCategoriaUseCase;
    
    public Categoria update(EditCategoriaCommand command){
        return editCategoriaUseCase.update(command);
    }
}
