package com.zabala.model.mapper;


import com.zabala.model.dto.ProductDTO;
import com.zabala.model.entity.Producto;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductoMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "nombre", source = "nombre")
    @Mapping(target = "descripcion", source = "descripcion")
    @Mapping(target = "precio", source = "precio")
    @Mapping(target = "categoria", source = "categoria")
    @Mapping(target = "stock", source = "stock")
    Producto toProducto(ProductDTO productDTO);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "nombre", source = "nombre")
    @Mapping(target = "descripcion", source = "descripcion")
    @Mapping(target = "precio", source = "precio")
    @Mapping(target = "categoria", source = "categoria")
    @Mapping(target = "stock", source = "stock")
    ProductDTO toProductoDto(Producto producto);

    List<ProductDTO> toProductosDTOList(List<Producto> productos);

    List<Producto> toProductosList(List<ProductDTO> productosDTOS);

}
