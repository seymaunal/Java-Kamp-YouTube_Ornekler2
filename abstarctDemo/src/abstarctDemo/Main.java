package abstarctDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.dataBaseManager =new MySqlDatabaseManager(); //buraya istersem sql yazar�m hi� bir s�k�nt� ��kmaz
		customerManager.getCustomer();

	}

}
