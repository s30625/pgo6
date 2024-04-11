import java.util.ArrayList;

public class Developer extends Employee{

    public Developer(String name, String surname, String address, String email, String PESEL, int yearOfEmployment) {
        super(name, surname, address, email, PESEL, yearOfEmployment);
    }

    private ArrayList<Technology> technologies = new ArrayList<Technology>();

    public void addTechnology(Technology t) {
        this.technologies.add(t);
    }

    @Override
    public int calculateSalary() {
        int bonus = 0;
        for(Technology t : technologies) {
            bonus += t.getBonus();
        }
        return super.calculateSalary() +  bonus;
    }
}

