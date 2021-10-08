package Service;

import java.util.List;

import domain.Service;

public interface IService{
	public Service createService();
	
	public void showService(List<Service> serviceList);
	
}