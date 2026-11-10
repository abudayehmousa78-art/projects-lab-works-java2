package java2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		try {
			ArrayList<StaffMember> list = new ArrayList<>();
			list.add(new Employee("10", "mmm", "mousa", "saed", LocalDate.of(2007, 9, 3), "059447142",
					"abudayehmousa78@gmail.com", "Birzeit@gmail.com", "Birzeit"));
			list.add(new Employee("10", "mmm", "mousa", "saed", LocalDate.of(2007, 9, 3), "059447142",
					"abudayehmousa78@gmail.com", "Birzeit@gmail.com", "Birzeit"));

			printList(list);
			Address a1 = new Address("AlAmeerHassan", "Birzeit", "palistine");
			Address a2 = new Address("kherba", "Birzeit", "palistine");
			Address[] arr = { a1, a2 };
			StaffMember m = new StaffMember("Mousa", "Saed", LocalDate.of(2007, 9, 3), "059447142",
					"abudayehmousa78@gmail.com", "Birzeit@gmail.com", "Birzeit");
			m.setAddress(arr);
			System.out.println(m.toString());
			System.out.println("your password is : " + m.Password());
			System.out.println(a1.toString());
			System.out.println(a2.toString());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	public static void printList(ArrayList<StaffMember> list){
		 for(int i = 0; i < list.size(); i++){
			 System.out.println(list.get(i).toString());
		 }
	}
	public static double totalPay(ArrayList<Employee> list){
		double sum = 0;
		for(int i = 0; i < list.size(); i++){
			if(list.get(i) instanceof HourlyEmployee){
				sum+=((HourlyEmployee)list.get(i)).getPay();
			}else if(list.get(i) instanceof WeeklyEmployee){
				sum+=((WeeklyEmployee)list.get(i)).getPay();
			}
		 }
		return sum;
	}


}
