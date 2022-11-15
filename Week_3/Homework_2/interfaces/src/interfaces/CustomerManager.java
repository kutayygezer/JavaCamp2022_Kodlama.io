package interfaces;

public class CustomerManager {
	
	private ICustomerDao customerDao;
	
	public CustomerManager(ICustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	public void add() {
		//iş kodları
		
		customerDao.add();
		
	}
}
