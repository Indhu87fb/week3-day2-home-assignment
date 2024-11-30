package week3.day2.homeassignment.InterfaceandAbstraction;

public class Concreteclass implements DatabaseConnection {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connection");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("disConnec");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Excute");
	}

}
