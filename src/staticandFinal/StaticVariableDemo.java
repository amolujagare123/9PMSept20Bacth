package staticandFinal;

public class StaticVariableDemo {

    final int speed =100;
//if a variable is declared as final,its value can not be changed
    void change()
    {
        //speed =100;
    }

    public static void main(String[] args) {

        StaticVariableDemo ob = new StaticVariableDemo();

        ob.change();

        System.out.println(ob.speed);

    }
}
