package exercise.leolord;

public class Administration extends Employee{

    private int vacation;

    public Administration() {
    }

    public Administration(String name, String cpr){
        super(name, cpr);
        setVacation(5);
        setSalary(23000);
        setHours(37);
    }
    public int getVacation() {
        return vacation;
    }

    public void setVacation(int vacation) {
        this.vacation = vacation;
    }
}
