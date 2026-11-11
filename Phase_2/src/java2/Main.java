package java2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<>();
		list.add(new HourlyEmployee((short) 100, 21, "40", "mousa Debartment", "Mousa", "Saed",
				LocalDate.of(2007, 9, 3), "059447142", "abudayehmousa78@gmail.com", "Birzeit@gmail.com", "Birzeit",
				new Address[] { new Address("AlAmeerHassan", "Birzeit", "Palistine") }));
		list.add(new HourlyEmployee((short) 100, 10, "15", "yacoub Debartment", "Yacoub", "Saed",
				LocalDate.of(2008, 9, 3), "059443442", "ayacoub@gmail.com", "Birzeit@gmail.com", "Birzeit",
				new Address[] { new Address("AlHashmia", "Ramallah", "Palistine") }));

		list.add(new WeeklyEmployee((byte) 2, (short) 500, "40", "mousa Debartment", "Mousa", "Saed",
				LocalDate.of(2007, 9, 3), "059447142", "abudayehmousa78@gmail.com", "Birzeit@gmail.com", "Birzeit",
				new Address[] { new Address("AlAmeerHassan", "Birzeit", "Palistine") }));
		list.add(new WeeklyEmployee((byte) 2, (short) 500, "40", "mousa Debartment", "Mousa", "Saed",
				LocalDate.of(2007, 9, 3), "059447142", "abudayehmousa78@gmail.com", "Birzeit@gmail.com", "Birzeit",
				new Address[] { new Address("AlAmeerHassan", "Birzeit", "Palistine") }));

		list.add(new SalariedEmployee(25000, "40", "mousa Debartment", "Mousa", "Saed", LocalDate.of(2007, 9, 3),
				"059447142", "abudayehmousa78@gmail.com", "Birzeit@gmail.com", "Birzeit",
				new Address[] { new Address("AlAmeerHassan", "Birzeit", "Palistine") }));
		list.add(new SalariedEmployee(25000, "40", "mousa Debartment", "Mousa", "Saed", LocalDate.of(2007, 9, 3),
				"059447142", "abudayehmousa78@gmail.com", "Birzeit@gmail.com", "Birzeit",
				new Address[] { new Address("AlAmeerHassan", "Birzeit", "Palistine") }));

		list.add(new CommissionEmployee(50, 4, "40", "mousa Debartment", "Mousa", "Saed", LocalDate.of(2007, 9, 3),
				"059447142", "abudayehmousa78@gmail.com", "Birzeit@gmail.com", "Birzeit",
				new Address[] { new Address("AlAmeerHassan", "Birzeit", "Palistine") }));
		list.add(new CommissionEmployee(50, 4, "40", "mousa Debartment", "Mousa", "Saed", LocalDate.of(2007, 9, 3),
				"059447142", "abudayehmousa78@gmail.com", "Birzeit@gmail.com", "Birzeit",
				new Address[] { new Address("AlAmeerHassan", "Birzeit", "Palistine") }));

		list.add(new ContractEmployee(900, (byte) 100, "40", "mousa Debartment", "Mousa", "Saed",
				LocalDate.of(2007, 9, 3), "059447142", "abudayehmousa78@gmail.com", "Birzeit@gmail.com", "Birzeit",
				new Address[] { new Address("AlAmeerHassan", "Birzeit", "Palistine") }));
		list.add(new ContractEmployee(900, (byte) 100, "40", "mousa Debartment", "Mousa", "Saed",
				LocalDate.of(2007, 9, 3), "059447142", "abudayehmousa78@gmail.com", "Birzeit@gmail.com", "Birzeit",
				new Address[] { new Address("AlAmeerHassan", "Birzeit", "Palistine") }));

		printList(list);
		System.out.println("total payment is : " + totalPayment(list));
		System.out.println("avarag payment is :" + averagePayment(list));
		ArrayList<Employee> above = aboveAverage(list);
		System.out.println("employe  above average : ");
		printList(above);
		Employee top = maxPayment(list);
		System.out.println("top payment : " + top);
		

		
	}

	public static void printList(ArrayList<Employee> list) {

		for (StaffMember l : list) {
			System.out.println("Staffmamber Info ::::" + l.toString());
			System.out.println("====================================");

		}
	}

	public static double totalPayment(ArrayList<Employee> list) {
		if (list.isEmpty())
			return 0;
		double sum = 0;
		for (Employee e : list) {
			sum += e.pay();
		}
		return sum;
	}

	public static double averagePayment(ArrayList<Employee> list) {
		if (list.isEmpty())
			return 0;
		return totalPayment(list) / list.size();
	}

	public static ArrayList<Employee> aboveAverage(ArrayList<Employee> list) {

		ArrayList<Employee> result = new ArrayList<>(list);
		double average = averagePayment(list);
		for (Employee e : list) {
			if (e.pay() > average) {
				result.add(e);
			}
		}
		return result;
	}
	
	public static Employee maxPayment(ArrayList<Employee> list) {

		if(list.isEmpty()) {
			return null;
		}
		Employee max = list.get(0);
		for (Employee e : list) {
			if(e.pay() > max.pay()) {
				max = e;
			}
		}
		return max;
		
	}

}

