package AbstractionDemo;

public interface InterfaceDemo {
    void run();
    void start();

    static void display()
    {
        System.out.println("This is display");
    }
}

class InterfaceChild implements InterfaceDemo
{
    public void run()
    {
        System.out.println("this is child run");
    }

    public void start()
    {
        System.out.println("this is child start");
    }

    public static void main(String[] args) {
        InterfaceDemo ob = new InterfaceChild();
        ob.run();
        ob.start();
        InterfaceDemo.display();
    }

}
