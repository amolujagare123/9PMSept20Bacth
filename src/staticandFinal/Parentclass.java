package staticandFinal;

public class Parentclass {

    final void display()
    {
        System.out.println("display");
    }
//if a method is declared as final it can not be overriden
}

class child extends Parentclass
{
   /* void display()
    {
        System.out.println("child display");
    }*/
}
