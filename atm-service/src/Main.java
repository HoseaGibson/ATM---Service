import java.util.Scanner;

public class Main {
	public static void validPin(int num) {
		
	}

	public static void main(String[] args) {
		// Display welcome message
		System.out.println("Welcome to ATM-Service");
		
		
		//System.out.println(pin);
		
		//Check if pin is valid
		int count = 3;
		int pin;
		Scanner s = new Scanner(System.in);
		while(count != 0) {
			System.out.println("Please Enter Pin Number");
			pin = s.nextInt();
			if(pin > 1111 && pin < 9999) {
				System.out.println("Welcome User");
				break;
			}else {
				System.out.println("Invalid entry");
				count--;
			}
		}
		System.out.println("To many attempts");
	}

}
