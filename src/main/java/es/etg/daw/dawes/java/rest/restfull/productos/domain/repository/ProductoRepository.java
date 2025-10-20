package es.etg.daw.dawes.java.rest.restfull.productos.domain.repository;

import es.etg.daw.dawes.java.rest.restfull.productos.domain.model.Producto;
import java.util.Optional;

public interface ProductoRepository extends CRUDRepository<Producto, Integer> {
    public Optional<Producto> getByName(String name);
}
