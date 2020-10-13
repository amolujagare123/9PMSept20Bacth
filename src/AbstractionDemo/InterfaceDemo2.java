package AbstractionDemo;

public interface InterfaceDemo2 {
    void run();
    void start();
    void display();
}

interface  AnotherInterface
{

    void display();
}

class InterfaceChild1 implements InterfaceDemo2,AnotherInterface {
    public void run() {
        System.out.println("this is child run");
    }

    public void start() {
        System.out.println("this is child start");
    }

    public void display()
    {
        System.out.println("this is a display method");
    }

    public static void main(String[] args) {
        InterfaceChild1 ob = new InterfaceChild1();

        ob.display();
    }

}