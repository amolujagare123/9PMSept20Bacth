package ClassesAndConstructor;

public class ClassDemo2 {

    int i;
    double d;
    char c;
    String str;

    /*ClassDemo2()
    {
        // no boday
        // empty constructor
    }*/

  ClassDemo2()
    {
       i = 10;
       d= 10.5;
       c= 'a';
       str = "amol";

    }


    ClassDemo2(int x , double y , char ch , String s)
    {
        i = x;
        d= y;
        c= ch;
        str = s;

    }

    void display() {
        System.out.println("i=" + i);
        System.out.println("d=" + d);
        System.out.println("c=" + c);
        System.out.println("str=" + str);
    }

    public static void main(String[] args) {

        ClassDemo2 ob =new ClassDemo2();

       // ob.display();

        ob.i = 10 ;
        ob.d = 45.67;
        ob.c = 'h';
        ob.str="some value";

       // ob.display();


        ClassDemo2 ob1 = new ClassDemo2(12,34.5,'g',"abcd");
        ob1.display();

    }

}
