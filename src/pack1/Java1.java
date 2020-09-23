package pack1;

public class Java1 {

    public int i1;
    private double d1;
    protected char c1;
    private String str1;

    public void display1()
    {
        d1=90;
        System.out.println("i="+i1);
        System.out.println("d="+d1);
        System.out.println("c="+c1);
        System.out.println("str="+str1);
    }

    public static void main(String[] args) {

        Java1 ob = new Java1();

        ob.i1 = 45;
        ob.d1 = 4.5;

        ob.str1 = "amol";

    }

}


