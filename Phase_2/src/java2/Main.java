package java2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<StaffMember> list = new ArrayList<>();
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
		
		list.add(new EmployeeBasedCommission(20,50, 4, "40", "mousa Debartment", "Mousa", "Saed", LocalDate.of(2007, 9, 3),
				"059447142", "abudayehmousa78@gmail.com", "Birzeit@gmail.com", "Birzeit",
				new Address[] { new Address("AlAmeerHassan", "Birzeit", "Palistine") }));
		list.add(new EmployeeBasedCommission(20,50, 4, "40", "mousa Debartment", "Mousa", "Saed", LocalDate.of(2007, 9, 3),
				"059447142", "abudayehmousa78@gmail.com", "Birzeit@gmail.com", "Birzeit",
				new Address[] { new Address("AlAmeerHassan", "Birzeit", "Palistine") }));
		

		printList(list);
		System.out.println("total payment is : " + totalPayment(list));
		System.out.println("avarag payment is :" + averagePayment(list));
		ArrayList<StaffMember> above = aboveAverage(list);
		System.out.println("employe  above average : ");
		printList(above);
		StaffMember top = maxPayment(list);
		System.out.println("top payment : " + top);
		System.out.println("================================");
		System.out.println("Sorting ascending by payment : ");
		sortPayment(list);

	}

	public static void printList(ArrayList<StaffMember> list) {

		for (StaffMember l : list) {
			System.out.println("Staffmamber Info ::::" + l.toString());
			System.out.println("====================================");

		}
	}

	public static double totalPayment(ArrayList<StaffMember> list) {
		if (list.isEmpty())
			return 0;
		double sum = 0;
		for (StaffMember e : list) {
			sum += e.pay();
		}
		return sum;
	}

	public static double averagePayment(ArrayList<StaffMember> list) {
		if (list.isEmpty())
			return 0;
		return totalPayment(list) / list.size();
	}

	public static ArrayList<StaffMember> aboveAverage(ArrayList<StaffMember> list) {

		ArrayList<StaffMember> result = new ArrayList<>();
		double average = averagePayment(list);
		for (StaffMember e : list) {
			if (e.pay() > average) {
				result.add(e);
			}
		}
		return result;
	}

	public static StaffMember maxPayment(ArrayList<StaffMember> list) {

		if (list.isEmpty()) {
			return null;
		}
		StaffMember max = list.get(0);
		for (StaffMember e : list) {
			if (e.pay() > max.pay()) {
				max = e;
			}
		}
		return max;
	}

	public static void sortPayment(ArrayList<StaffMember> list) {
		ArrayList<StaffMember> sort = new ArrayList<>();
		for (StaffMember s : list) {
			sort.add(s);
		}
		for (int i = 0; i < sort.size(); i++) {
			for (int j = 0; j < sort.size() - 1; j++) {
				if (sort.get(j).pay() > sort.get(j + 1).pay()) {
					StaffMember temp = sort.get(j);
					sort.set(j, sort.get(j + 1));
					sort.set(j + 1, temp);
				}
			}
		}
		printList(sort);
	}

}
