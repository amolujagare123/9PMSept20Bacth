package InheritanceDemopack;

public class Employee {

    int salary =40000;

    void display()
    {
        System.out.println("salary="+salary);
    }

}

class programer extends  Employee
{
    int bonus =10000;

    public static void main(String[] args) {

        programer p = new programer();

        System.out.println(p.bonus);

        System.out.println(p.salary);

        p.display();


    }

}
