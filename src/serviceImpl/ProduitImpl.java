package serviceImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import domaine.Categorie;
import domaine.Produit;
import service.IProduit;

public class ProduitImpl implements IProduit{
    Scanner sc = new Scanner(System.in);
    
    SimpleDateFormat sdF = new SimpleDateFormat("dd/MM/yyyy");

    @Override
	public Produit addProduit(Categorie cat) {
		// TODO Auto-generated method stub
		Produit p = new Produit();
		System.out.println("Entrer l'id du produit \n");
		String id = "";
		id = sc.nextLine();
		p.setId(Integer.parseInt(id));
		System.out.println("Entrer le nom du produit");
		 String nom = sc.nextLine();
		 p.setNom(nom);
		 System.out.println("Entrer le prix du produit");
		String prix = sc.nextLine();
		 p.setPrice(Double.parseDouble(prix));
		 System.out.println("Entrer la date du produit");
		 String  datep = sc.nextLine();
		 try {
			p.setDateP(sdF.parse(datep));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 p.setCategorie(cat);
		return p;
	}

}
