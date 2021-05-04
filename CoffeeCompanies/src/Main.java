
public class Main {

	public static void main(String[] args) {
		Customer customer=new Customer("Batuhan","Gülcü","123");
		
		BaseCustomerManager customerManager=new StarbucksManager();
		customerManager.save(customer);
		
		
	}

}
