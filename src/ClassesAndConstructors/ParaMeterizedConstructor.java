package ClassesAndConstructors;

public class ParaMeterizedConstructor {

    int a;
    double d;
    char c;
    String str;


    ParaMeterizedConstructor(int a,double d,char c,String str)
    {
        this.a = a;
        this.d = d;
        this.c = c;
        this.str=str;
    }

    void display(int a)
    {
        System.out.println("a="+this.a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        ParaMeterizedConstructor ob = new ParaMeterizedConstructor(12,45.6,'j',"amol");
      ///  ob.display();
    }
}
