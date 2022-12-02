package com.Tienda.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="articulo")
public class Articulo implements Serializable{
    
    private static final long serialVersionUID= 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_articulo")
    private Long idArticulo;
    private Long idCategoria;
    private String description;
    private String detalle;
    private Double precio;
    private int existencias;
    private boolean activa; 


    public Articulo() {
    }

    public Articulo(Long idCategoria, String description, String detalle, Double precio, int existencias, boolean activa) {
        this.idCategoria = idCategoria;
        this.description = description;
        this.detalle = detalle;
        this.precio = precio;
        this.existencias = existencias;
        this.activa = activa;
    }


       
}
