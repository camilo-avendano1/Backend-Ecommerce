package com.zabala.model.mapper;

import com.zabala.model.dto.ProductDTO;
import com.zabala.model.entity.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-21T14:29:53-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.11 (Amazon.com Inc.)"
)
@Component
public class ProductoMapperImpl implements ProductoMapper {

    @Override
    public Producto toProducto(ProductDTO productDTO) {
        if ( productDTO == null ) {
            return null;
        }

        Producto producto = new Producto();

        producto.setId( productDTO.getId() );
        producto.setNombre( productDTO.getNombre() );
        producto.setDescripcion( productDTO.getDescripcion() );
        producto.setPrecio( productDTO.getPrecio() );
        producto.setCategoria( productDTO.getCategoria() );
        producto.setStock( productDTO.getStock() );

        return producto;
    }

    @Override
    public ProductDTO toProductoDto(Producto producto) {
        if ( producto == null ) {
            return null;
        }

        ProductDTO productDTO = new ProductDTO();

        productDTO.setId( producto.getId() );
        productDTO.setNombre( producto.getNombre() );
        productDTO.setDescripcion( producto.getDescripcion() );
        productDTO.setPrecio( producto.getPrecio() );
        productDTO.setCategoria( producto.getCategoria() );
        productDTO.setStock( producto.getStock() );

        return productDTO;
    }

    @Override
    public List<ProductDTO> toProductosDTOList(List<Producto> productos) {
        if ( productos == null ) {
            return null;
        }

        List<ProductDTO> list = new ArrayList<ProductDTO>( productos.size() );
        for ( Producto producto : productos ) {
            list.add( toProductoDto( producto ) );
        }

        return list;
    }

    @Override
    public List<Producto> toProductosList(List<ProductDTO> productosDTOS) {
        if ( productosDTOS == null ) {
            return null;
        }

        List<Producto> list = new ArrayList<Producto>( productosDTOS.size() );
        for ( ProductDTO productDTO : productosDTOS ) {
            list.add( toProducto( productDTO ) );
        }

        return list;
    }
}
