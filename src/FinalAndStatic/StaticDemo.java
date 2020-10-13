package FinalAndStatic;

public class StaticDemo {

    int rno;
    String name;
    static String college="ABC";

    void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }

    public static void main(String[] args) {

        StaticDemo ob = new StaticDemo();

        ob.rno =1;
        ob.name="usha";
        //ob.college="ABC";

        ob.display();


        StaticDemo ob1 = new StaticDemo();

        ob1.rno =2;
        ob1.name="amol";

        ob1.display();

        System.out.println(StaticDemo.college);






    }
}
