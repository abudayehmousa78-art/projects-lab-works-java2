package java2;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		try {
	         Address a1 = new Address("Al_Ameer_Hassan", "Birzeit", "palistine");
	         Address a2 = new Address("Al_Ameer_Hassan", "Birzeit", "palistine");
	         Address[] arr = { a1, a2 };
	         StaffMember m = new StaffMember("Mousa", "Saed", LocalDate.of(2007, 9, 3),
	               "059447142", "abudayehmousa78@gmail.com", "Birzeit@gmail.com", "Birzeit");
	         m.setAddress(arr);
	         System.out.println(m.toString());
	         System.out.println("your password is : " + m.Password());
	         System.out.println(a1.toString());
	         System.out.println(a2.toString());
	      } catch (Exception e) {
	         System.out.println(e.getMessage());
	      }
		
	}

}
