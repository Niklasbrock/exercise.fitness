package exercise.leolord;

public class Person {
    protected String name;
    protected String cpr;

    public Person() {
    }
    Person(String name, String cpr){
        this.name = name;
        this.cpr = cpr;
    }
    public String getName() {
        return name;
    }
    public String getCpr() {
        return cpr;
    }
}
