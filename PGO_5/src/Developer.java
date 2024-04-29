import java.util.ArrayList;

public class Developer extends Employee{

    public Developer(String firstName, String lastName, String city, String emailAddress, String pesel, int yearOfEmployment) {
        super(firstName, lastName, city, emailAddress, pesel, yearOfEmployment);

    }
    private ArrayList<Technology> technologies=new ArrayList<>();
    protected String techType;
    protected int bonus;

    public void addTechnology(Technology Technology){
        technologies.add(Technology);
    }
}
