package java2;
import java.time.LocalDate;
import java.util.Random;

public class StaffMember {

	
	private String First_Name;
    private String Last_Name;
    private LocalDate Date_of_Birth;
    private Address[] address;
    private String Mobile_Number;
    private String Personal_Email;
    private String Work_Email;
    private String Company_Name;

    public StaffMember(String First_Name, String Last_Name, LocalDate Date_of_Birth,
            String Mobile_Number, String Personal_Email, String Work_Email, String Company_Name) {

        if (address != null) {
            this.address = new Address[address.length];
            for (int i = 0; i < address.length; i++) {
                this.address[i] = address[i];
            }
        } else {
            this.address = new Address[0];
        }

        if (IsValidName(First_Name))
            this.First_Name = First_Name;
        else
            System.out.println("invalid first nane");

        if (IsValidName(Last_Name))
            this.Last_Name = Last_Name;
        else
            System.out.println("invalid last name");

        if (CheckDateOfBirth(Date_of_Birth))
            this.Date_of_Birth = Date_of_Birth;
        else
            System.out.println("not allowed to work");

        if (CheckMobileNumber(Mobile_Number))
            this.Mobile_Number = Mobile_Number;
        else
            System.out.println("invalid number");

        if (CheckPersonalEmail(Personal_Email))
            this.Personal_Email = Personal_Email;
        else
            System.out.println("not allowed email");

        workEmailAuto(First_Name, Last_Name, Work_Email, Company_Name);
        setCompanyName(Company_Name);

    }

    public boolean IsValidName(String name) {
        for (int i = 0; i < name.length(); i++) {
            if (name.toLowerCase().charAt(i) < 'a' || name.toLowerCase().charAt(i) > 'z') {

                return false;
            }
        }
        return true;

    }

    public String getFirstName() {
        return First_Name;
    }

    public String getLastName() {
        return Last_Name;
    }

    public boolean CheckDateOfBirth(LocalDate Date_of_Birth) {
        if (Date_of_Birth == null) {
            return false;
        }
        int nowYear = LocalDate.now().getYear();
        int birth = Date_of_Birth.getYear();

        int age = nowYear - birth;
        if (age < 67 && age >= 16) {
            return true;
        }
        return false;
    }

    public LocalDate getDate() {
        return Date_of_Birth;
    }

    public boolean CheckMobileNumber(String Mobile_Number) {
        if (Mobile_Number == null || Mobile_Number.length() != 9) {
            return false;
        }
        for (int i = 0; i < Mobile_Number.length(); i++) {
            if (Mobile_Number.charAt(i) < '0' || Mobile_Number.charAt(i) > '9') {
                return true;
            }
        }
        if (Mobile_Number.charAt(0) == '0' && Mobile_Number.charAt(1) == '5') {
            if (Mobile_Number.charAt(2) == '9' || Mobile_Number.charAt(2) == '6') {
                return true;
            }
        }
        return false;
    }

    public String getMobileNumber() {
        return Mobile_Number;
    }

    public boolean CheckPersonalEmail(String Personal_Email) {
        if (Personal_Email == null || Personal_Email.toLowerCase().charAt(0) < 'a'
                || Personal_Email.toLowerCase().charAt(0) > 'z') {
            return false;
        }
        for (int j = 0; j < Personal_Email.length(); j++) {
            if (Personal_Email.charAt(j) == '!' || Personal_Email.charAt(j) == '$') {
                return false;
            }
        }
        if (Personal_Email.endsWith("@gmail.com") || Personal_Email.endsWith("@gmail.edu") ||
                Personal_Email.endsWith("@gmail.org") || Personal_Email.endsWith("@gmail.net")) {
            return true;
        }
        return false;

    }

    public String getPersonalEmail() {
        return Personal_Email;
    }

    private void workEmailAuto(String First_Name, String Last_Name, String Work_Email, String Company_Name) {
        if (First_Name == null || Last_Name == null || Work_Email == null || Company_Name == null)
            return;
        String domain = "";
        int Index = Work_Email.lastIndexOf('.');
        if (Index != -1) {
            domain = Work_Email.substring(Index);
        }
        if (Work_Email.endsWith("@gmail.com") || Work_Email.endsWith("@gmail.edu") ||
                Work_Email.endsWith("@gmail.org") || Work_Email.endsWith("@gmail.net")) {
            this.Work_Email = First_Name.substring(0, 1).toLowerCase() + Last_Name.toLowerCase()
                    + ("@" + Company_Name + domain);
        }
    }

    public String getWorkEmail() {
        return Work_Email;
    }

    public void setCompanyName(String Company_Name) {
        this.Company_Name = Company_Name;
    }

    public String getCompanyName() {
        return Company_Name;
    }

    public double pay() {
        return 0;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("First name : ").append(First_Name);
        s.append("\nLast name : ").append(Last_Name);
        s.append("\nDate : ").append(Date_of_Birth);
        s.append("\nMobile number : ").append(Mobile_Number);
        s.append("\nPersonal email : ").append(Personal_Email);
        s.append("\nWork email : ").append(Work_Email);
        s.append("\nCompany name : ").append(Company_Name);
        return s.toString();
    }

    public String Password() {
        String p = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*";
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            password.append(p.charAt(random.nextInt(p.length())));
        }

        return password.toString();
    }

    public Address[] getAddress() {
        return address;
    }

    public void setAddress(Address[] address) {
        this.address = address;
    }
	
}
