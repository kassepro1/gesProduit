package Service;

import java.util.List;

import domain.Serveur;
import domain.Service;
import domain.TypeServeur;

public interface IServer {
	public Serveur createServeur (TypeServeur typeServeur, Service service);
	
	public void showServeur(List<Serveur> serveurList,List<TypeServeur> typeServeurList);

}
