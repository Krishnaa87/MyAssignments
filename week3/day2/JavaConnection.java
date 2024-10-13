package week3.day2;

public class JavaConnection implements DatabaseConnection{
	

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("connect is  established");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("disconnected now");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("executeUpdate is Done");
	}
	
	
	public static void main(String[] args) {
		JavaConnection obj1 = new JavaConnection();
		obj1.connect();
		obj1.executeUpdate();
		obj1.disconnect();
		
	}

}
