import java.time.LocalDate;
import java.time.Year;
import java.util.Date;

public class Employee {
    //protected String name;
    public String name;
    public String surname;
    public String address;
    public String email;
    public String PESEL;
    public int yearOfEmployment;

    public Employee(String name, String surname, String address, String email, String PESEL, int yearOfEmployment) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.email = email;
        this.PESEL = PESEL;
        this.yearOfEmployment = yearOfEmployment;
    }

    public int calculateSalary(){
        int salary = 0;


        return 3000 + 1000 * (Year.now().getValue()-yearOfEmployment);
    }

}
