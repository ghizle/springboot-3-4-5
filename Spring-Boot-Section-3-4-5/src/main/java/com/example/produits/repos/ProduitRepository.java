package com.example.produits.repos;

import com.example.produits.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.produits.entities.Produit;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

    @Query("select p from Produit p where p.nomProduit like %:nom and p.prixProduit > :prix")
    List<Produit> findByNomPrix (@Param("nom") String nom, @Param("prix") Double prix);
    @Query("select p from Produit p where p.categorie = ?1") List<Produit> findByCategorie (Categorie categorie);
    @Query("select p from Produit p order by p.nomProduit ASC, p.prixProduit DESC") List<Produit> trierProduitsNomsPrix();
    List<Produit> findByNomProduit(String nom);
    List<Produit> findByNomProduitContains(String nom);
    List<Produit> findByCategorieIdCat(Long id);
    List<Produit> findByOrderByNomProduitAsc();


}