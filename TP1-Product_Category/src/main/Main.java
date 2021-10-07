package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import domaine.Categorie;
import domaine.Produit;
import serviceImpl.CategorieImpl;
import serviceImpl.ProduitImpl;

public class Main {

	public static void main(String[] args) throws ParseException {
		// add categorie 
	SimpleDateFormat sdF = new SimpleDateFormat("dd/MM/yyyy");
	Categorie cg = new Categorie();
	cg.setId(1);
	cg.setNom("Films");
	String  datep = "21/10/2012";
	Date dt =  sdF.parse(datep);
	List<Produit> pdts = Arrays.asList(new Produit(1,"GOT",12,dt, cg));
	List<Produit> pdtsList = new ArrayList<>();
	pdtsList.add(new Produit(1,"GOT",12,dt, cg));

	Produit pToUpdate = new Produit();
	pToUpdate.setNom("SGG");
	pToUpdate.setPrice(22);

	CategorieImpl categorieImpl = new CategorieImpl();
	
	ProduitImpl pImpl = new ProduitImpl();
	 int id = 1;
	 Produit p = pImpl.findProduitById(id, pdts);
	 System.out.println("Le produit d'id :"+id+" est "+p.getNom());
	  // update a produit by Id 
	 Produit pUpdated = pImpl.updateProduit(id, pToUpdate, pdts);
	 System.out.println("Le produit mis a jour a pour id :"+pUpdated.getId()+" et le nom est : "+pUpdated.getNom());
	 
	 // Show all products 
	 pImpl.showProducts(pdts);
	 // Delete a product by id 
	 pImpl.deleteProduit(id, pdtsList);
	 // show list after deletion of product by id
	 System.out.println("List apres suppression");
	 pImpl.showProducts(pdtsList);

	 //Categorie cat = categorieImpl.addCategorie();
	// Produit prod = pImpl.addProduit(cat);
	// System.out.println("Nom produit : "+p.getNom()+" a pour categorie "+p.getCategorie().getNom());
	}
	

}
