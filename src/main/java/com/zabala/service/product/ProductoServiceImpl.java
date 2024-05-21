package com.zabala.service.product;

import com.zabala.model.dto.ProductDTO;
import com.zabala.model.entity.Producto;
import com.zabala.model.mapper.ProductoMapper;
import com.zabala.model.repository.ProductoRepository;
import org.springframework.data.crossstore.ChangeSetPersister;


import org.springframework.stereotype.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import java.util.List;
@Service
public class ProductoServiceImpl implements IProductService{
    public ProductoRepository productoRepository;
    public ProductoMapper productoMapper;

    @Override
    public Page<ProductDTO> findAll(Pageable pageable) throws RuntimeException{
        Page<Producto> productos = productoRepository.findAll(pageable);
        if (productos == null) {
            throw new RuntimeException("No se encontraron productos");
        }
        return new PageImpl<>(productoMapper.toProductosDTOList(productos.getContent()),  pageable, productos.getTotalElements());
    }

    @Override
    public ProductDTO findById(Integer id) throws RuntimeException{
        if (productoRepository.findById(id).isPresent()) {
            return productoMapper.toProductoDto(productoRepository.findById(id).get());
        }
        throw new RuntimeException("No se encontró el producto");
    }

    @Override
    public boolean save(ProductDTO product) {
        productoRepository.save(productoMapper.toProducto(product));
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public Page<ProductDTO> findByCategoria(String categoria, Pageable pageable) {
        return null;
    }

    @Override
    public Page<ProductDTO> findByNombreContaining(String nombre, Pageable pageable) {
        return null;
    }

    @Override
    public Page<ProductDTO> findByPrecioBetween(Double precio1, Double precio2, Pageable pageable) {
        return null;
    }
//







//    public ProductoRepository productoRepository;
//
//    public ProductoMapper productoMapper;
//
//    @Override
//    public List<ProductDTO> findAll() {
//        Iterable<Producto> productos = productoRepository.findAll();
//        if (productos == null) {
//            return null;
//        }
//        return productoMapper.toProductosDTOList((List<Producto>) productoRepository.findAll());
//
//    }
//
//    @Override
//    public ProductDTO findById(Integer id) {
//        if (productoRepository.findById(id).isPresent()) {
//            return productoMapper.toProductoDto(productoRepository.findById(id).get());
//        }
//        return null;
//    }
//
//    @Override
//    public boolean save(ProductDTO product) {
//        if (productoRepository.save(productoMapper.toProducto(product)) != null) {
//            return true;
//        }
//        return false;
//    }
//
//    @Override
//    public boolean delete(Integer id) {
//        if (productoRepository.findById(id).isPresent()) {
//            productoRepository.deleteById(id);
//            return true;
//        }
//        return false;
//    }
}
