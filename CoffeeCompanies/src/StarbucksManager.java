
public class StarbucksManager extends BaseCustomerManager implements ICustomerCheck {
	
	
	
	
	
	
	
	public void star() {
		//Y�ld�z ekle
		
		
		
	}
	BaseCustomerManager baseCustomerManager=new BaseCustomerManager();
	CustomerCheck customerCheck=new CustomerCheck();
	@Override
	public void  save(Customer customer) {
		if(customerCheck.check(customer)) {	
		baseCustomerManager.save(customer);
		System.out.println("Kaydedilmi�tir: "+customer.getFirstName());}
		
	
		else {
			System.out.println("ge�ersiz giri�");
			
		}
	
	
	}
		



	@Override
	public boolean check(Customer customer) {
		return true;
	}


	
	
	
}
