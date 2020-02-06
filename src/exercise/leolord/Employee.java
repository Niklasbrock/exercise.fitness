package exercise.leolord;

public class Employee extends Person{
    private int hours;
    private int salary;
    private int vacation;


    public Employee() {
    }

    public Employee(String name, String cpr) {
        super(name, cpr);
    }
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getVacation() {
        return vacation;
    }

    public void setVacation(int vacation) {
        this.vacation = vacation;
    }
}
