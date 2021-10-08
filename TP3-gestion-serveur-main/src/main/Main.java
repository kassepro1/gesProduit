package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ServiceImpl.ServeurImpl;
import ServiceImpl.ServiceImpl;
import ServiceImpl.TypeServeurImpl;
import domain.Serveur;
import domain.Service;
import domain.TypeServeur;

public class Main {

	public static void main(String[] args) {
		String choix = "";
		ServiceImpl serviceImpl = new ServiceImpl();
		ServeurImpl serveurImpl = new ServeurImpl();
		List<Service> serviceList = new ArrayList();
		List<Serveur> serveurList = new ArrayList();
		List<TypeServeur> typeServeurList = new ArrayList();
		Scanner sc = new Scanner(System.in);
		Service s = null;
		TypeServeur ts = null;
		while (!choix.equals("6")) {
			System.out.println("1:Créer un service \n");
			System.out.println("2:Créer un TypeServeur \n");
			System.out.println("3:Créer un Serveur \n");
			System.out.println("4:Lister les services \n");
			System.out.println("5:Lister les serveurs \n");
			System.out.println("6:Quitter le menu \n");
			System.out.println("Choix : \n");
			choix = sc.nextLine();
			if (choix.equals("1")) {
				
				// Création of Service
				 s = serviceImpl.createService();
				 serviceList.add(s);
			}
			
			if (choix.equals("2")) {
				TypeServeurImpl typeServeurImpl = new TypeServeurImpl();
				// Création TypeServeur
				 ts = typeServeurImpl.createTypeServeur();
				 typeServeurList.add(ts);
			}
			
			if (choix.equals("3")) {
				// Création Serveur
				Serveur serv = serveurImpl.createServeur(ts,s);
				serveurList.add(serv);
				serveurImpl.showServeur(serveurList,typeServeurList);
				System.out.println("Le nom du serveur est: " + serv.getName() + "et son type de serveur est:"
						+ serv.getTypeServeur().getName());
			}
			
			if (choix.equals("4")) {
				
			serviceImpl.showService(serviceList);

			}
			
			if (choix.equals("5")) {
				
			serveurImpl.showServeur(serveurList,typeServeurList);

			}
			
			

		}

	}

}
