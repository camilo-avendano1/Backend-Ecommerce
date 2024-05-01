package com.zabala.service.product;

import com.zabala.model.dto.ProductDTO;
import com.zabala.model.entity.Producto;
import com.zabala.model.mapper.ProductoMapper;
import com.zabala.model.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductoServiceImpl implements IProductService{

    public ProductoRepository productoRepository;

    public ProductoMapper productoMapper;

    @Override
    public List<ProductDTO> findAll() {
        Iterable<Producto> productos = productoRepository.findAll();
        if (productos == null) {
            return null;
        }
        return productoMapper.toProductosDTOList((List<Producto>) productoRepository.findAll());

    }

    @Override
    public ProductDTO findById(Integer id) {
        if (productoRepository.findById(id).isPresent()) {
            return productoMapper.toProductoDto(productoRepository.findById(id).get());
        }
        return null;
    }

    @Override
    public boolean save(ProductDTO product) {
        if (productoRepository.save(productoMapper.toProducto(product)) != null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        if (productoRepository.findById(id).isPresent()) {
            productoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
