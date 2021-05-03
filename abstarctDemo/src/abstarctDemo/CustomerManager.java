package abstarctDemo;

public class CustomerManager {
	
	BaseDatabaseManager dataBaseManager; //hanggi veri tabanýný seçersek o çalýþacak
	//oracle yada sql yazýp ona baðýmlý olmamamýzý saðlýyor
	
	public void getCustomer() {
		dataBaseManager.getData();
	}

}
