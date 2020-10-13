package MethodsReturning;

import pack1.Java2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sample {

    // return type :

    void display()
    {
        // void means nothing - it doesnot return anything

        System.out.println("this is display");
    }

    int somemethod()
    {
        // if you have return type other than void
        // it can be a data type , string, date , array (single / 2d)
        int a = 45;

        return a; // return 78;
    }

    Date getThedate()
    {
        Date date = new Date();

        return  date;
    }

    int[] getMyArray()
    {
        int[] a = {34,56,12,43,6,21,21,12};

        return  a;

    }


    String[][] getMyStringArray()
    {
        String[][] starr= {
                {"abc1","pqr1","xyz1"},
                {"abc2","pqr2","xyz2"},
                {"abc3","pqr3","xyz3"}
        };

        return  starr;

    }

    Java2 getMyObject()
    {
        Java2 obj = new Java2();
        obj.a2=10;
        obj.d2=98.90;
        obj.c2='d';
        obj.str2="amol";

        return obj;
    }



    Date getAnotherdate() throws ParseException {
        String dateStr = "12/10/2019";

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

        Date date = sd.parse(dateStr);

        return  date;
    }



    public static void main(String[] args) throws ParseException {

        Sample ob = new Sample();

        ob.somemethod();
        // the method which retuns some value ,
        // actually hold the same value

        int x = 10;

        System.out.println(x);

        System.out.println(ob.somemethod());

        int y =ob.somemethod();

        System.out.println(y);


        System.out.println(ob.getThedate());

        System.out.println(ob.getAnotherdate());


        int[] methodArr = ob.getMyArray();

        for(int i=0;i<methodArr.length;i++)
            System.out.print(methodArr[i]+" ");


        String[][] methodStrArr = ob.getMyStringArray();

        System.out.println();
        for(int i=0;i<methodStrArr.length;i++)
        {
            for (int j=0;j<methodStrArr[0].length;j++)
            {
                System.out.print(methodStrArr[i][j]+" ");
            }
            System.out.println();
        }


        System.out.println("-----priting java2 object-----");
        Java2 java2 = new Java2();

        java2.display2();


        java2 = ob.getMyObject();
        System.out.println("-----priting java2 object-----");
        java2.display2();


        Java2  j2 = ob.getMyObject();

        j2.display2();


    }

}
