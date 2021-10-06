package service;

import java.util.List;

import domaine.Categorie;
import domaine.Produit;

public interface IProduit {
	
	public Produit addProduit(Categorie cat);
	
	public Produit findProduitById(int id,List<Produit> pdts);
	
	public Produit updateProduit(int id , Produit p,List<Produit> pdts);
	
	public void deleteProduit(int id, List<Produit> pdts);
	
	public void showProducts(List<Produit> pdts);

}
