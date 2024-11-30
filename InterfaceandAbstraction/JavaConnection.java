package week3.day2.homeassignment.InterfaceandAbstraction;

public class JavaConnection extends MySqlConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection JC =new JavaConnection();
		//Interce method calling
		JC.connect();
		JC.disconnect();
		JC.executeQuery();
		//MySqlConnection -Abstract method calling
		JC.executeUpdate();
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connection");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("disConnect");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("ExecuteUpdate");
	}

	@Override
	void executeQuery() {
		// TODO Auto-generated method stub
		System.out.println("executeQuery");
	}

}
