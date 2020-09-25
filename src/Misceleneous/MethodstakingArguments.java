package Misceleneous;

import PolyMorphismDemo.Demo1;

import java.util.Date;

public class MethodstakingArguments {

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


    public  void printMyArray(int[] a)
    {
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");

    }

    public void  printMyAray2d(String[][] s)
    {
        for(int i=0;i<s.length;i++)
        {
            for(int j=0;j<s[0].length;j++)
            {
                System.out.print(s[i][j]+"\t\t");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {

        MethodstakingArguments demo1 = new MethodstakingArguments();

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



        int[] x = {345,56,324,23,23,534,645};

        demo1.printMyArray(x);


        String[][] ss = {

                {"abc1","pqr1","xyz1"},
                {"abc2","pqr2","xyz2"},
                {"abc3","pqr3","xyz3"},
                {"abc4","pqr4","xyz4"}
        };
        System.out.println("\n\ntwo d array print---\n\n");
        demo1.printMyAray2d(ss);

    }
}
