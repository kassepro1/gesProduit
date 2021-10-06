package serviceImpl;

import java.util.Scanner;

import domaine.Categorie;
import service.ICategorie;

public class CategorieImpl implements ICategorie{
  Scanner sc = new Scanner(System.in);
	@Override
	public Categorie addCategorie() {
		// TODO Auto-generated method stub
		Categorie c = new Categorie();
		System.out.println("Entrer l'id \n");
		String id = "";
		id = sc.nextLine();
		c.setId(Integer.parseInt(id));
		System.out.println("Entrer le nom de la categorie \n");
		 String nom = sc.nextLine();
		 c.setNom(nom);
		return c;
	}

}
