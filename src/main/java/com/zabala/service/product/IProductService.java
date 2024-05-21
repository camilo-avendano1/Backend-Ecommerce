package com.zabala.service.product;

import com.zabala.model.dto.ProductDTO;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import java.util.List;

public interface IProductService {

    public Page<ProductDTO> findAll(Pageable pageable);

    public ProductDTO findById(Integer id);

    public boolean save(ProductDTO product);

    public boolean delete(Integer id);

    public Page<ProductDTO> findByCategoria(String categoria, Pageable pageable);

    public Page<ProductDTO> findByNombreContaining(String nombre, Pageable pageable);

    public Page<ProductDTO> findByPrecioBetween(Double precio1, Double precio2, Pageable pageable);


    

}
