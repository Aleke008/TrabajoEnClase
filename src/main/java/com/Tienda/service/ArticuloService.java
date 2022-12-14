package com.Tienda.service;

import com.Tienda.domain.Articulo;
import java.util.List;


public interface ArticuloService {
    public List<Articulo> getArticulo(boolean activos);
    
    public void save (Articulo articulo);
    
    public void delete(Articulo articulo);
    
    public Articulo getArticulo(Articulo articulo);
}
