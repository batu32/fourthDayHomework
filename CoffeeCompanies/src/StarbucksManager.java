
public class StarbucksManager extends BaseCustomerManager implements ICustomerCheck {
	
	
	
	
	
	
	
	public void star() {
		//Yýldýz ekle
		
		
		
	}
	BaseCustomerManager baseCustomerManager=new BaseCustomerManager();
	CustomerCheck customerCheck=new CustomerCheck();
	@Override
	public void  save(Customer customer) {
		if(customerCheck.check(customer)) {	
		baseCustomerManager.save(customer);
		System.out.println("Kaydedilmiþtir: "+customer.getFirstName());}
		
	
		else {
			System.out.println("geçersiz giriþ");
			
		}
	
	
	}
		



	@Override
	public boolean check(Customer customer) {
		return true;
	}


	
	
	
}
