package es.etg.daw.dawes.java.rest.restfull.productos.infraestructure.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import es.etg.daw.dawes.java.rest.restfull.productos.application.services.CreateProductoService;
import es.etg.daw.dawes.java.rest.restfull.productos.application.usecase.CreateProductoUseCase;
import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class ProductConfig {
@Bean
    public CreateProductoUseCase createProductoUseCase() {
        return new CreateProductoUseCase();
    }
    @Bean
    public CreateProductoService createProductoService(){
        return new CreateProductoService(createProductoUseCase());
    }
}
