package com.zabala.service.product;

import com.zabala.model.dto.ProductDTO;

import java.util.List;

public interface IProductService {

    public List<ProductDTO> findAll();

    public ProductDTO findById(Integer id);

    public boolean save(ProductDTO product);

    public boolean delete(Integer id);
    
    

}
