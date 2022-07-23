package application;

public class App {
	public static void main(String[] args) throws Exception {
		
		Person p1 = new Person();
		
		try {
		p1.setName(null);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		//without try/catch, the program hits the exception and exits
		//with try/catch, the program catches the exception and keeps going
		System.out.println("Program completed");
	}
}
