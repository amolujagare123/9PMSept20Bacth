package InheritanceDemopack;

public class Overloadingdemo {

    void add()
    {
        int a, b;
        a =10;
        b=20;
        int c=0;

        c= a+b;
        System.out.println("Addition is ="+c);
    }

    void add(int a, int b)
    {
        int c = 0;

        c= a+b;
        System.out.println("Addition is ="+c);
    }

    public static void main(String[] args) {

        Overloadingdemo ob = new Overloadingdemo();
        ob.add();
        ob.add(12,45);

    }

}
