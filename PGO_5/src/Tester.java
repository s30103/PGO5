import java.util.ArrayList;

public class Tester extends Employee{

    public Tester(String firstName, String lastName, String city, String emailAddress, String pesel, int yearOfEmployment) {
        super(firstName, lastName, city, emailAddress, pesel, yearOfEmployment);

    }


    protected String ttName;
    protected int ttBonus;
    ArrayList<String> tests = new ArrayList<>();


    public void addTestType(String testName){
        this.ttName = testName;
        this.ttBonus = 300;
    }
}
