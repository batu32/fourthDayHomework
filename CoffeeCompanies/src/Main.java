
public class Main {

	public static void main(String[] args) {
		Customer customer=new Customer("Batuhan","G�lc�","123");
		
		BaseCustomerManager customerManager=new StarbucksManager();
		customerManager.save(customer);
		
		
	}

}
