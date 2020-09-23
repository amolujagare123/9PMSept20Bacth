package InheritanceDemo;

public class Animal {

    void eat()
    {
        System.out.println("eat");
    }
}


class Dog extends Animal
{
    void barks()
    {
        System.out.println("barks");
    }

}


class  Testclass1
{
    public static void main(String[] args) {

       Dog dog = new Dog();

       dog.barks();
       dog.eat();
    }
}
