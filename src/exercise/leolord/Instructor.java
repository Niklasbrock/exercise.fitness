package exercise.leolord;

public class Instructor extends Employee{

    public int getRate(){return 456;}

    public Instructor(int hours, String name, String cpr){
        super(name, cpr);
        setSalary(hours*getRate());
        setHours(hours);
    }
}
