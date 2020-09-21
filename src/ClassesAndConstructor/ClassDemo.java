package ClassesAndConstructor;

public class ClassDemo {

    int i;
    double d;
    char c;
    String str;

    void display()
    {
        System.out.println("i="+i);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        ClassDemo ob = new ClassDemo();

        ob.i = 10 ;
        ob.d = 45.67;
        ob.c = 'h';
        ob.str="some value";

        //System.out.println(ob.i);

        ob.display();

        ClassDemo ob1 = new ClassDemo();

        ob1.i = 11;
        ob1.d = 12.4;
        ob1.c = 'g';
        ob1.str ="another string";

        ob1.display();

    }

}
