package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Produit;

public interface lProduitService {
	
List<Produit> getProduits();
	
	void addProduit(Produit produit);
	
	void updateProduit(Produit produit);
	
	void deleteProduit(String ref);

}
