package abstarctDemo;

public class CustomerManager {
	
	BaseDatabaseManager dataBaseManager; //hanggi veri taban�n� se�ersek o �al��acak
	//oracle yada sql yaz�p ona ba��ml� olmamam�z� sa�l�yor
	
	public void getCustomer() {
		dataBaseManager.getData();
	}

}
