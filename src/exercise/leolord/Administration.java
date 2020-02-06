package exercise.leolord;

public class Administration extends Employee{

    public Administration() {
    }

    public Administration(String name, String cpr){
        super(name, cpr);
        setVacation(5);
        setSalary(23000);
        setHours(37);
    }
}
