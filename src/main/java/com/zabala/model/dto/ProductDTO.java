package com.zabala.model.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private Integer id;
    private String nombre;
    private String descripcion;
    private Double precio;
    private String categoria;
    private Integer stock;
}
