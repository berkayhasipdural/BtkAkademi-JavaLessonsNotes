package interfaces;

public class CustomerManager implements ICustomerDal {
	
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	public void add() {
		//iş kodları
		customerDal.add();
	}
}
