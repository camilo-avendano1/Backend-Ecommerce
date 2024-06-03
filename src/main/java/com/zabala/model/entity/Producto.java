package com.zabala.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@Table(name = "producto")
public class Producto {
    @Id
    @Column(name = "product_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "descripcion", nullable = false)
    private String descripcion;
    @Column(name = "precio", nullable = false)
    private Double precio;
    @Column(name = "categoria", nullable = false)
    private String categoria;
    @Column(name = "stock", nullable = false)
    private Integer stock;
    @Column(name = "imagen")
    private String imagen;

}
