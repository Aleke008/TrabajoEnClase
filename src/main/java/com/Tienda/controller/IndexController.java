package com.Tienda.controller;

import com.Tienda.dao.ArticuloDao;
import com.Tienda.domain.Articulo;
import com.Tienda.service.ArticuloService;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private ArticuloService articuloService;
    
    @GetMapping("/")
    public String inicio(Model model){
        log.info("Estamos usando una arquitectura mvc");
        
        var articulos = articuloService.getArticulo(true);
        
        model.addAttribute("articulos", articulos);
        return "index";
    }
    

}
