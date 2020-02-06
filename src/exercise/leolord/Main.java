package exercise.leolord;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Employee instructor1 = new Instructor(10, "instructor1", "123456-1234");
        Employee instructor2 = new Instructor(10, "instructor2", "223456-1235");
        Employee instructor3 = new Instructor(10, "instructor3", "323456-1236");

        Employee administrator1 = new Administration("administrator1", "176543-8765");
        Employee administrator2 = new Administration("administrator2", "276543-8766");
        Employee administrator3 = new Administration("administrator3", "376543-8767");

        Member member1 = new Member("member1", "100100-999", true);
        Member member2 = new Member("member2", "200200-666", false);
        Member member3 = new Member("member2", "300300-333", false);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(instructor1);
        employees.add(instructor2);
        employees.add(instructor3);
        employees.add(administrator1);
        employees.add(administrator2);
        employees.add(administrator3);

        ArrayList<Member> members = new ArrayList<>();
        members.add(member1);
        members.add(member2);
        members.add(member3);

        ArrayList<Person> people = new ArrayList<>();
        people.addAll(employees);
        people.addAll(members);


//	    Print Employees
        System.out.println("FITNESS EMPLOYEES");
        System.out.printf("%-20s%-15s%-15s%-15s%-15s\n", "Name", "Cpr", "Hours", "Salary", "Vacation");
        System.out.println("***************************************************************************");
        for (Employee employee :
                employees) {
            if (employee instanceof Administration){
                System.out.printf("%-20s%-15s%-15s%-15s%-15s\n", employee.getName(), employee.getCpr(), employee.getHours(), employee.getSalary(), ((Administration) employee).getVacation());
            } else{
                System.out.printf("%-20s%-15s%-15s%-15s\n", employee.getName(), employee.getCpr(), employee.getHours(), employee.getSalary());
            }
        }

        System.out.println();

//      Print Members
        System.out.println("FITNESS MEMBERS");
        System.out.printf("%-20s%-15s%-15s%-15s\n", "Name", "Cpr", "Member Type", "Fee");
        System.out.println("***************************************************************************");
        for (Member member :
                members) {
            System.out.printf("%-20s%-15s%-15s%-15s\n", member.getName(), member.getCpr(), member.getMemberType(), member.monthlyFee());
        }

        System.out.println();

//      Print Employee & Member names and cpr's
        System.out.println("EMPLOYEE & MEMBER Names and Cpr's");
        System.out.printf("%-20s%-15s\n", "Name", "Cpr");
        System.out.println("***************************************************************************");
        for (Person person :
                people) {
            System.out.printf("%-20s%-15s\n", person.getName(), person.getCpr());
        }
    }
}
