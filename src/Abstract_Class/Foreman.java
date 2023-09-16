package Abstract_Class;

public class Foreman extends Worker {
    @Override
    protected int hourlyWage() {
        return 15;
    }

    @Override
    protected int monthlyWorkingHours() {
        return 200;
    }

    public static void main(String[] args) {

        Foreman foreman = new Foreman();
        foreman.hourlyWage = foreman.hourlyWage();
        foreman.monthlyWorkingHours = foreman.monthlyWorkingHours();
        foreman.salary = foreman.salary(foreman.hourlyWage, foreman.monthlyWorkingHours);
        foreman.name = "Ayhan";
        foreman.lastName = "KAYA";

        System.out.println("Salary : " + foreman.salary + "\n" +
                "Name : " + foreman.name + "\n" +
                "Last Name : " + foreman.lastName);

        /*
        OUTPUT:
        Salary : 3000
        Name : Ayhan
        Last Name : KAYA
         */
    }
}
