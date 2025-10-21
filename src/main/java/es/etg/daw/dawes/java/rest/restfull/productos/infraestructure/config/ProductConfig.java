package es.etg.daw.dawes.java.rest.restfull.productos.infraestructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import es.etg.daw.dawes.java.rest.restfull.productos.application.services.CreateProductoService;
import es.etg.daw.dawes.java.rest.restfull.productos.application.services.DeleteProductoService;
import es.etg.daw.dawes.java.rest.restfull.productos.application.services.FindProductoService;
import es.etg.daw.dawes.java.rest.restfull.productos.application.services.UpdateProductoService;
import es.etg.daw.dawes.java.rest.restfull.productos.application.usecase.CreateProductoUseCase;
import es.etg.daw.dawes.java.rest.restfull.productos.application.usecase.DeleteProductoUseCase;
import es.etg.daw.dawes.java.rest.restfull.productos.application.usecase.FindProductoUseCase;
import es.etg.daw.dawes.java.rest.restfull.productos.application.usecase.UpdateProductoUseCase;
import es.etg.daw.dawes.java.rest.restfull.productos.domain.repository.ProductoRepository;
import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class ProductConfig {

    private final ProductoRepository productoRepository;
    
    @Bean
    public CreateProductoUseCase createProductoUseCase() {
        // Añadimos en la llamada una instancia de nuestro MOCK.
        return new CreateProductoUseCase(productoRepository);
    }

    @Bean
    public CreateProductoService createProductoService() {
        return new CreateProductoService(createProductoUseCase());
    }

    @Bean
    public FindProductoUseCase findProductoUseCase() {
        return new FindProductoUseCase(productoRepository);
    }

    @Bean
    public FindProductoService findProductoService() {
        return new FindProductoService(findProductoUseCase());
    }

    @Bean
    public DeleteProductoUseCase deleteProductoUseCase() {
        return new DeleteProductoUseCase(productoRepository);
    }

    @Bean
    public DeleteProductoService deleteProductoService() {
        return new DeleteProductoService(deleteProductoUseCase());
    }

    @Bean
    public UpdateProductoUseCase updateProductoUseCase() {
        return new UpdateProductoUseCase(productoRepository);
    }

    @Bean
    public UpdateProductoService updateProductoService() {
        return new UpdateProductoService(updateProductoUseCase());
    }

}
