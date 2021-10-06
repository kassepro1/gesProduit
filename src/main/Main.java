package main;

import domaine.Categorie;
import domaine.Produit;
import serviceImpl.CategorieImpl;
import serviceImpl.ProduitImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// add categorie 
		
	CategorieImpl categorieImpl = new CategorieImpl();
	
	ProduitImpl pImpl = new ProduitImpl();
	Categorie cat = categorieImpl.addCategorie();
	 Produit p = pImpl.addProduit(cat);
	 System.out.println("Nom produit : "+p.getNom()+" a pour categorie "+p.getCategorie().getNom());
	}

}
