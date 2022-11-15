package interfaces;

public class MySqlCustomerDao implements ICustomerDao {

	@Override
	public void add() {
		System.out.println("My sql eklendi");
	}

}
