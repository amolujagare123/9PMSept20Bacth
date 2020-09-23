package pack2;


import pack1.Java1;

public class Java3 extends Java1{

    int i3;
    double d3;
    char c3;
    String str3;

    void display3()
    {
        System.out.println("i="+ i3);
        System.out.println("d="+d3);
        System.out.println("c="+c3);
        System.out.println("str="+str3);
    }

    public static void main(String[] args) {

        Java1 ob = new Java1();

        ob.i1 =89;
       // ob.c1 = 23;

        ob.display1();


        Java3 obJava3 = new  Java3();

        obJava3.i1 = 56;
        obJava3.c1 = 56;



    }
}
