package FinalAndStatic;

public class Parent {


    /*final*/ void myMethod()
    {
        System.out.println("This is parent method");
    }


}

class child extends  Parent
{
    void myMethod() // overridden method
    {
        System.out.println("This is child method");
    }


}
