package java2;

public class Address {
	
	private String Street;
    private String City;
    private String Country;

    public Address(String Street, String City, String Country) {
        setStreet(Street);
        setCity(City);
        setCountry(Country);
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        if (!isValid(Street)) {
            System.out.println("is no allowed");
            return;
        }
        this.Street = Street;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        if (!isValid(City)) {
        	System.out.println("is no allowed");
            return;
        }
        this.City = City;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        if (!isValid(Country)) {
        	System.out.println("is no allowed");
            return;
        }
        this.Country = Country;
    }

    public String toString() {
        return "Address [street = " + Street + ", city = " + City + ", country = " + Country + "]";
    }

    private boolean isValid(String o){
       if(o == null || o.length() == 0){
        return false;
       }
       for(int i = 0; i < o.length(); i++){
        if(!((o.charAt(i) >= 'a' && o.charAt(i) <= 'z') || (o.charAt(i) >= 'A' && o.charAt(i) <= 'Z') 
        		|| (o.charAt(i) >= '0' && o.charAt(i) <= '9') || o.charAt(i) == ' ')){
            return false;
       }
    }
    return true;
    }

}
