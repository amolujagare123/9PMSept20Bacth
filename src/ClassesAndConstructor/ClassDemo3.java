package ClassesAndConstructor;

public class ClassDemo3 {

    int i=78;
    double d=8.90;
    char c;
    String str;

    ClassDemo3(int i , double d , char c , String str)
    {
        this.i = i;
        this.d= d;
        this.c= c;
        this.str = str;

    }

    void display() {
        System.out.println("i=" + i);
        System.out.println("d=" + d);
        System.out.println("c=" + c);
        System.out.println("str=" + str);
    }

    public static void main(String[] args) {

        ClassDemo3 ob = new ClassDemo3(2,2.3,'g',"abcd");
        ob.display();

    }
}
