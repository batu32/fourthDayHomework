
public class NeroManager extends BaseCustomerManager{
	@Override
	public void  save(Customer customer) {
		System.out.println("Neroya Kaydedilmi�tir: "+customer.getFirstName());
	}

}
