package com.zabala.controller;

import com.zabala.model.dto.ProductDTO;
import com.zabala.model.entity.Producto;
import com.zabala.model.repository.ProductoRepository;
import com.zabala.service.product.IProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {
    IProductService productService;


    ProductoRepository productoRepository;


    @Operation(summary = "Obtener todos los productos existentes", description = "obtener todos los productos existentes", responses = {
            @ApiResponse(responseCode = "200", description = "productos encontrados", content = @Content(schema = @Schema(implementation = ProductDTO[].class ))),
            @ApiResponse(responseCode = "404", description = "No se encontraron productos", content = @Content(schema = @Schema(implementation = String.class))) })
    @GetMapping("/all")
    public ResponseEntity<Page<Producto>> findAll(Pageable pageable){
        Page<Producto> productos = productoRepository.findAll(pageable);
        if (productos.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return  ResponseEntity.ok(productos);
    }




    @Operation(summary = "Obtener todos los productos existentes", description = "obtener todos los productos existentes", responses = {
            @ApiResponse(responseCode = "200", description = "productos encontrados", content = @Content(schema = @Schema(implementation = ProductDTO[].class ))),
            @ApiResponse(responseCode = "404", description = "No se encontraron productos", content = @Content(schema = @Schema(implementation = String.class))) })
    @GetMapping("/categoria")
    public ResponseEntity<Page<Producto>> findcategoria(Pageable pageable, String categoria){
        Page<Producto> productos = productoRepository.findByCategoria(categoria, pageable);
        if (productos.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return  ResponseEntity.ok(productos);
    }



    @Operation(summary = "Obtener todos los productos existentes entre un rango de precio", description = "obtener todos los productos existentes", responses = {
            @ApiResponse(responseCode = "200", description = "productos encontrados", content = @Content(schema = @Schema(implementation = ProductDTO[].class ))),
            @ApiResponse(responseCode = "404", description = "No se encontraron productos", content = @Content(schema = @Schema(implementation = String.class))) })
    @GetMapping("/precios")
    public ResponseEntity<Page<Producto>> productosPorPrecio(Pageable pageable, Double precio1, Double precio2){
        Page<Producto> productos = productoRepository.findByPrecioBetween(precio1, precio2, pageable);
        if (productos.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return  ResponseEntity.ok(productos);
    }


    @Operation(summary = "Obtener todos los productos existentes por un nombre", description = "obtener todos los productos existentes", responses = {
            @ApiResponse(responseCode = "200", description = "productos encontrados", content = @Content(schema = @Schema(implementation = ProductDTO[].class ))),
            @ApiResponse(responseCode = "404", description = "No se encontraron productos", content = @Content(schema = @Schema(implementation = String.class))) })
    @GetMapping("/nombre")
    public ResponseEntity<Page<Producto>> productospornombre(Pageable pageable, String nombre){
        Page<Producto> productos = productoRepository.findByNombreContaining(nombre, pageable);
        if (productos.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return  ResponseEntity.ok(productos);
    }

    //guardar un producto
    @Operation(summary = "Guardar un producto", description = "Guardar un producto", responses = {
            @ApiResponse(responseCode = "200", description = "producto guardado", content = @Content(schema = @Schema(implementation = ProductDTO[].class ))),
            @ApiResponse(responseCode = "400", description = "No se pudo guardar el producto", content = @Content(schema = @Schema(implementation = String.class))) })
    @PostMapping("/save")
    public ResponseEntity<Producto> saveProduct(Producto producto){
        Producto product = productoRepository.save(producto);
        if (product == null){
            return ResponseEntity.badRequest().build();
        }
        return  ResponseEntity.ok(product);
    }
}
