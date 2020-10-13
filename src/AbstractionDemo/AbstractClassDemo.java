package AbstractionDemo;

public abstract  class AbstractClassDemo {
    abstract void run(); // abstract method
    abstract void start();

    void display() // concret method / non abstract method
    {
        System.out.println("this is display");
    }

}

class Child extends AbstractClassDemo
{
    void run()
    {
        System.out.println("Run in child");
    }

    void start()
    {
        System.out.println("Start in child");
    }

    public static void main(String[] args) {
        AbstractClassDemo ob = new Child();
        ob.run();
        ob.start();

    }

}
