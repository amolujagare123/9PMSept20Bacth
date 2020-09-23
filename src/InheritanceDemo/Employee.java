package InheritanceDemo;

public class Employee {
    int salary =7000;

    void getsalary()
    {
        System.out.println(salary);
    }
}

class programmer extends Employee
{
    int bonus =500;

    public static void main(String[] args) {

        programmer p = new programmer();

        System.out.println(p.bonus);

        System.out.println(p.salary);

        p.getsalary();

    }

}
