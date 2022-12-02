package com.Tienda.domain;

import lombok.Data;

@Data
public class item extends Articulo{
    private int cantidad;

    public item() {
    }
    
    public item(Articulo articulo){
        super.setIdArticulo(articulo.getIdArticulo());
        super.setIdCategoria(articulo.getIdCategoria());
        super.setDescription(articulo.getDescription());
        super.setDetalle(articulo.getDetalle());
        super.setPrecio(articulo.getPrecio());
        super.setExistencias(articulo.getExistencias());
        super.setActivo(articulo.isActivo());
        super.setRutaImagen(articulo.getRutaImange()));
        this.cantidad = 0;
        
    }


    
    
}
