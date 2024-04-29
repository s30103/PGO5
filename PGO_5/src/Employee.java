import java.util.ArrayList;

public class Employee extends Program{
    public String fname;
    public String lname;
    public String pesel;
    public String email;

    public String address;

    protected int yearOfEmployment;

    protected int currentYear = 2024;

    public ArrayList<String> employees = new ArrayList<>();

    public Employee(String firstName, String lastName, String city, String emailAddress, String pesel, int yearOfEmployment) {
        this.fname = firstName;
        this.lname = lastName;
        this.address = city;
        this.email = emailAddress;
        this.pesel = pesel;
        this.yearOfEmployment = yearOfEmployment;
    }
    public int calculateSalary(){
        int i = currentYear - yearOfEmployment;
        int totalAmount = i*1000 + 3000;
        return totalAmount;
    }
}
