package com.zabala.controller;

import com.zabala.model.dto.ProductDTO;
import com.zabala.service.product.IProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {
    IProductService productService;




//
//    @Operation(summary = "Obtener todos los productos existentes", description = "obtener todos los productos existentes", responses = {
//            @ApiResponse(responseCode = "200", description = "Computador encontrado", content = @Content(schema = @Schema(implementation = ProductDTO[].class ))),
//            @ApiResponse(responseCode = "404", description = "No se encontraron productos", content = @Content(schema = @Schema(implementation = String.class))) })
//    @GetMapping("/all")
//    public ResponseEntity<List<ProductDTO>> findAll(){
//        List<ProductDTO> productos = productService.findAll();
//        if (productos.isEmpty()){
//            return ResponseEntity.notFound().build();
//        }
//        return  ResponseEntity.ok(productos);
//    }



}
