
public class NeroManager extends BaseCustomerManager{
	@Override
	public void  save(Customer customer) {
		System.out.println("Neroya Kaydedilmiştir: "+customer.getFirstName());
	}

}
