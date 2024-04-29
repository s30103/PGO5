import java.util.ArrayList;

public class Manager extends Employee{

    public Manager(String firstName, String lastName, String city, String emailAddress, String pesel, int yearOfEmployment) {
        super(firstName, lastName, city, emailAddress, pesel, yearOfEmployment);

    }
    private ArrayList<Goal>goals=new ArrayList<>();
    public void addGoals(Goal goal){
        goals.add(goal);
    }
    @Override
    public int calculateSalary(){
        int baseAmount = super.calculateSalary();
        int bonus = 0;
        for (Goal goal : goals) {
            if (goal.achievments()){
                bonus += goal.getBonus();
            }
        }
        return baseAmount + bonus;
    }



}
