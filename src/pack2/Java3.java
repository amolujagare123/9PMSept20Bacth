package pack2;


import pack1.Java1;

public class Java3 extends Java1 {

    int a3;
    double d3;
    char c3;
    String str3;

    void display3()
    {
        System.out.println("a="+a3);
        System.out.println("d="+d3);
        System.out.println("c="+c3);
        System.out.println("str="+str3);
    }

    public static void main(String[] args) {
        Java1 ob = new Java1();
        //anothe class in another package

        ob.a1 =78;
        //ob.c1='c';

        Java3 ob3 = new Java3();

        ob3.a1 = 10;
        ob3.d1 =98.5;
       // ob3.c1 ='b';
    }
}
