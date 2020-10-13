package FinalAndStatic;

public class finalVariableDemo {

    final int speed = 100;

    void change()
    {
       // speed = 120;
    }

    public static void main(String[] args) {

        finalVariableDemo ob = new finalVariableDemo();

        System.out.println(ob.speed); // ?? 100

        ob.change();
        System.out.println(ob.speed); // ??


    }
}
