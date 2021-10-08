package ServiceImpl;

import java.util.Scanner;

import Service.ITypeServeur;
import domain.TypeServeur;

public class TypeServeurImpl implements ITypeServeur{
	Scanner scanner = new Scanner(System.in);

	@Override
	public TypeServeur createTypeServeur() {
		// TODO Auto-generated method stub
		TypeServeur typeServeur = new TypeServeur();
		System.out.println("entrée l'id \n ");
		String id = scanner.nextLine();
		typeServeur.setId(Integer.parseInt(id));
		
		System.out.println("entrée le name");
		String name = scanner.nextLine();
		typeServeur.setName(name);
		
		return typeServeur;
	}
	
}
