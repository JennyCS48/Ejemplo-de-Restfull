package es.etg.daw.dawes.java.rest.restfull.productos.domain.repository;

import es.etg.daw.dawes.java.rest.restfull.common.domain.repository.CRUDRepository;
import es.etg.daw.dawes.java.rest.restfull.productos.domain.model.Producto;
import es.etg.daw.dawes.java.rest.restfull.productos.domain.model.ProductoId;

import java.util.Optional;

public interface ProductoRepository extends CRUDRepository<Producto, ProductoId> {
    
    public Optional<Producto> getByName(String name);
}
