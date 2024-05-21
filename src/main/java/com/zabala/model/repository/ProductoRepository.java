package com.zabala.model.repository;

import com.zabala.model.entity.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductoRepository extends CrudRepository<Producto, Integer> {
    Page<Producto> findAll(Pageable pageable);

    Page<Producto> findByCategoria(String categoria, Pageable pageable);

    Page<Producto> findByNombreContaining(String nombre, Pageable pageable);

    Page<Producto> findByPrecioBetween(Double precio1, Double precio2, Pageable pageable);

}
