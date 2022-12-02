package com.Tienda.service;

import com.Tienda.domain.item;
import java.util.ArrayList;
import java.util.List;


public interface itemService {
    public List<item> listaitem = new ArrayList<>();
    
    public void save (item Item);
    
    public void delete(item Item);
    
    public item getitem(item Item);
}
