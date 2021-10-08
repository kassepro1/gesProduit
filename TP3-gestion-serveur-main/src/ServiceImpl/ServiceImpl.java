package ServiceImpl;

import java.util.List;
import java.util.Scanner;

import Service.IService;
import domain.Service;

public class ServiceImpl implements IService{
	Scanner sC = new Scanner(System.in);
	
	
	@Override
	public Service createService() {
		// TODO Auto-generated method stub
		System.out.println("Création du service");
		Service serve = new Service();
		System.out.println("entrée l'id \n ");
		String id = sC.nextLine();
		serve.setId(Integer.parseInt(id));
		
		System.out.println("entrée le nom");
		String name = sC.nextLine();
		serve.setName(name);
		
		System.out.println("entrée l'adress");
		String adress =sC.nextLine();
		serve.setAdress(adress);
		return serve;
	}


	@Override
	public void showService(List<Service> serviceList) {
		// TODO Auto-generated method stub
		System.out.println("Affichage des services");
		for (int i=0;i<serviceList.size();i++) {
			System.out.println("Nom: " + serviceList.get(i).getName()+" Adresse: " + serviceList.get(i).getAdress());
		}
		
	}
	
}