package FinalAndStatic;

public class StaticMethodDemo {

    int rno;
    String name;
    public static String college="ABC";

    void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }

    public static void setCollegeName(String cName) // non static method
    {
        college = cName;

    }


    public static void main(String[] args) {


        StaticMethodDemo.setCollegeName("ABCD");

        System.out.println(StaticMethodDemo.college);

    }

}
