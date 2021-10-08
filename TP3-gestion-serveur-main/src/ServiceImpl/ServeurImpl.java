package ServiceImpl;

	import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

import Service.IServer;
	import domain.Serveur;
	import domain.Service;
	import domain.TypeServeur;
	
	public class ServeurImpl implements IServer {
		Scanner sC = new Scanner(System.in);
		
	@Override
	public Serveur createServeur(TypeServeur typeServeur, Service service) {
		// TODO Auto-generated method stub 
		System.out.println(" Entrer l'id ");
		String id = sC.nextLine();
		System.out.println(" Entrer le nom ");
		String name = sC.nextLine();
		System.out.println(" Entrer l'adresse ip ");
		String ipAdress = sC.nextLine();
		int idS = Integer.parseInt(id);
		Serveur server = new Serveur(idS,name,ipAdress,typeServeur,service);		
		
		
		return server;
		
	}

	@Override
	public void showServeur(List<Serveur> serveurList,List<TypeServeur> typeServeurList) {
	System.out.println("Affichage des serveurs :");
	Map<String,List<Serveur>> serveurMap = new HashMap();
	for (TypeServeur ts : typeServeurList) {
		List<Serveur> serveurss = serveurList.stream().
				filter(s -> s.getTypeServeur().getId() == ts.getId()).collect(Collectors.toList());
	serveurMap.put(ts.getName(), serveurss);
		
	}
	
	for (Entry<String, List<Serveur>> servMap:  serveurMap.entrySet()) {
		for (Serveur serv : servMap.getValue()) {
			System.out.println("TypeServeur : " + servMap.getKey());
			System.out.println("Nom serveur: " + serv.getName());
		}
	}
	}
	
	

}
