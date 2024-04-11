import java.util.ArrayList;

//ctrl + o do nadpisywania metod. Wymagany aktywny kursor na nazwie klasy
    public class Tester extends Employee{

        public Tester(String name, String surname, String address, String email, String PESEL, int yearOfEmployment) {
            super(name, surname, address, email, PESEL, yearOfEmployment);
        }

        private ArrayList<String> TestType = new ArrayList<String>();


        @Override
        public int calculateSalary() {
            return super.calculateSalary() + TestType.size() * 300;
        }

    public void addTestType(String s) {
    }
}

