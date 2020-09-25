package PolyMorphismDemo;

import java.util.Date;

public class Demo1 {

    int a,b;

    void addition()
    {
        int c ;
        c= a + b;
        System.out.println("addition:"+c);
    }

    void addition(int x ,int y)
    {
        int c ;

        c = x +y;
        System.out.println("addition:"+c);
    }

    void addition(double x ,double y)
    {
        double c ;

        c = x +y;
        System.out.println("addition:"+c);
    }

    void  addition (int x, int y,int z)
    {
        int c ;
        c= x+y+z;
        System.out.println("addition:"+c);

    }

    void addition (String name1 , String name2)
    {
        String c;
        c= name1+name2;
        System.out.println("addition:"+c);
    }

    public static void main(String[] args) {

        Demo1 demo1 = new Demo1();

       /* demo1.addition();
        demo1.addition(23,23);
        demo1.addition(34.67,89.4);
        demo1.addition(23,45,76);
        demo1.addition("amol","ujagare");
        demo1.addition('b','u');*/
        //demo1.addition('b',"amol");


        String str = "java class";
        System.out.println(str); // string as an argument

        int i =10;
        System.out.println(i);  // integer as an argument

        double d = 90.1;
        System.out.println(d);  // double as an argument

        char c = 'h';
        System.out.println(c);  //character as an argument

        Date date = new Date();
        System.out.println(date); // date  as an argument


    }

}
