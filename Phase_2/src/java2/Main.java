package java2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		

		ArrayList<StaffMember> list = new ArrayList<>();
		list.add(new HourlyEmployee((short)100, 21, "40", "mousa Debartment", "Mousa", "Saed", LocalDate.of(2007, 9, 3),
				"059447142","abudayehmousa78@gmail.com", "Birzeit@gmail.com", "Birzeit", new Address[] {new Address("AlAmeerHassan", "Birzeit", "Palistine")}));
		list.add(new HourlyEmployee((short)100, 10, "15", "yacoub Debartment", "Yacoub", "Saed", LocalDate.of(2008, 9, 3),
				"059443442","ayacoub@gmail.com", "Birzeit@gmail.com", "Birzeit", new Address[] {new Address("AlHashmia", "Ramallah", "Palistine")}));
		
		
		printList(list);

	}

	public static void printList(ArrayList<StaffMember> list) {

		for (StaffMember l : list) {
			System.out.println("Staffmamber Info [ " + l.toString() + " ]");
			System.out.println("====================================");

		}
	}

	public static double totalPay(ArrayList<Employee> list) {
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof HourlyEmployee) {
				sum += ((HourlyEmployee) list.get(i)).getPay();
			} else if (list.get(i) instanceof WeeklyEmployee) {
				sum += ((WeeklyEmployee) list.get(i)).getPay();
			}
		}
		return sum;
	}

}
