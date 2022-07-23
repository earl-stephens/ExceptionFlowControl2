package application;

public class App {
	public static void main(String[] args) throws Exception {
		
		Person p1 = new Person();
		
		try {
		p1.setName("Mary");
		System.out.println("Still in try block");
		//Won't print due to catching the exception
		//immediately jumps into the catch block
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
			//will throw the exception again and won't print
			//the statement below, but can use finally to 
			//execute some kind of code after the exception
		}
		finally {
			System.out.println("In finally block");
		}
		
		//without try/catch, the program hits the exception and exits
		//with try/catch, the program catches the exception and keeps going
		System.out.println("Program completed");
	}
}
/*finally lets us add some code to the end of the try catch block
 * for allowing some code to be executed after the exception is thrown
 * Will still execute even if the exception is not thrown */
