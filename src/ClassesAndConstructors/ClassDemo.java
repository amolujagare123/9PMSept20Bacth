package ClassesAndConstructors;

public class ClassDemo {

    int a = 20;
    double d;
    char c;
    String str;

    ClassDemo()
    {
         a = 10;
         d= 10.2;
         c='g';
         str="amol";
    }

    ClassDemo(ClassDemo obj)
    {
        a= obj.a;
        d=obj.d;
        c=obj.c;
        str=obj.str;
    }


    ClassDemo(int a1,double d1,char c1,String str1)
    {
        a = a1;
        d = d1;
        c = c1;
        str=str1;
    }

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        ClassDemo ob = new ClassDemo();

        /*ob.a=10;
        ob.d=23.6;
        ob.c='h';
        ob.str="abcd";*/
        ob.display();

        System.out.println("\nobject ob1");
        ClassDemo ob1 = new ClassDemo(12,56.7,'g',"abcde");
        ob1.display();

        System.out.println("\nobject ob2");
        ClassDemo ob2 = new ClassDemo(ob1);
        ob2.display();


      /*  ClassDemo ob1 = new ClassDemo(12,56.7,'g',"abcde");
        ob1.display();
*/


        /*ClassDemo ob1 = new ClassDemo();
        ob1.a=4;
        ob1.d=7.8;
        ob1.c='j';
        ob1.str="pqr";
        ob1.display();*/


    }


}
