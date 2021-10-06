package serviceImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;
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

	@Override
	public Produit findProduitById(int id, List<Produit> pdts) {
		Produit prod = pdts.stream().filter(p->p.getPrice()==id).findFirst().orElse(new Produit());
		return prod;
	}

	@Override
	public Produit updateProduit(int id, Produit p,List<Produit> pdts) {
		Produit produit = findProduitById(id, pdts);
		p.setId(produit.getId());
		int index = pdts.indexOf(produit);
		pdts.set(index, p);
		return pdts.get(index);
	}

	@Override
	public void deleteProduit(int id, List<Produit> pdts) {
		Produit p = findProduitById(id, pdts);
		pdts.remove(p);
	}

	@Override
	public void showProducts(List<Produit> pdts) {
	  pdts.stream().forEach(p->{
		  System.out.println(p);
	  });
	}



}
