package domaine;

import java.util.Date;

public class Produit {
	
	private int id;
	
	private String nom;
	
	private double price;
	
	private Date dateP ;
	
	private Categorie categorie;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getDateP() {
		return dateP;
	}

	public void setDateP(Date dateP) {
		this.dateP = dateP;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Produit(int id, String nom, double price, Date dateP, Categorie categorie) {
		super();
		this.id = id;
		this.nom = nom;
		this.price = price;
		this.dateP = dateP;
		this.categorie = categorie;
	}

	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", nom=" + nom + ", price=" + price + ", dateP=" + dateP + ", categorie="
				+ categorie + "]";
	}
	
	
	
	

}
