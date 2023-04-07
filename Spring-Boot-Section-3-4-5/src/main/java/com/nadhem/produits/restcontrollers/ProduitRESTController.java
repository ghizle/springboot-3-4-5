package com.nadhem.produits.restcontrollers;

import com.example.produits.entities.Produit;
import com.example.produits.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

    @RestController
    @RequestMapping("/api")
    @CrossOrigin
    public class ProduitRESTController {
        @Autowired
        ProduitService produitService;
        @RequestMapping(method = RequestMethod.GET)
        public List<Produit> getAllProduits() {
            return produitService.getAllProduits();
        }
    }

