package ClassesAndConstructor;

public class CopyConstructorDemo {

    int i;
    double d;
    char c;
    String str;

    CopyConstructorDemo()
    {
        i = 12;
        d =1.4;
        c='w';
        str ="manisha";
    }

    CopyConstructorDemo(CopyConstructorDemo obj)
    {
        i = obj.i;
        d = obj.d;
        c = obj.c;
        str = obj.str;
    }

    void display() {
        System.out.println("i=" + i);
        System.out.println("d=" + d);
        System.out.println("c=" + c);
        System.out.println("str=" + str);
    }

    public static void main(String[] args) {

        CopyConstructorDemo ob = new CopyConstructorDemo();

        ob.i = 2;
        ob.d= 2.2;
        ob.c='c';
        ob.str="smita";

        ob.display();


        CopyConstructorDemo ob1 = new CopyConstructorDemo(ob);

        ob1.display();

    }
}
