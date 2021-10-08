package domain;

public class Serveur {
	private int id;
	private String name;
	private String ipAdress;
	private TypeServeur typeServeur;
	private Service Service;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIpAdress() {
		return ipAdress;
	}
	public void setIpAdress(String ipAdress) {
		this.ipAdress = ipAdress;
	}
	public TypeServeur getTypeServeur() {
		return typeServeur;
	}
	public void setTypeServeur(TypeServeur typeServeur) {
		this.typeServeur = typeServeur;
	}
	public Service getService() {
		return Service;
	}
	public void setService(Service service) {
		Service = service;
	}
	public Serveur(int id, String name, String ipAdress, TypeServeur typeServeur, domain.Service service) {
		super();
		this.id = id;
		this.name = name;
		this.ipAdress = ipAdress;
		this.typeServeur = typeServeur;
		Service = service;
	}
	public Serveur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
