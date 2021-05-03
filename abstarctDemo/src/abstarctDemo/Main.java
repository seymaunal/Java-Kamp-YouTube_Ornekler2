package abstarctDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.dataBaseManager =new MySqlDatabaseManager(); //buraya istersem sql yazarım hiç bir sıkıntı çıkmaz
		customerManager.getCustomer();

	}

}
