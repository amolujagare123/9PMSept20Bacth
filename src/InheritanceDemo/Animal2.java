package InheritanceDemo;

public class Animal2 {

    void eat()
    {
        System.out.println("eat");
    }

}

class Dog2 extends Animal2
{
    void barks()
    {
        System.out.println("barks");
    }
}

class  Cat extends Animal2
{
    void meow()
    {
        System.out.println("meow");
    }
}

class testinheritance3
{
    public static void main(String[] args) {
        Animal2 animal2 = new Animal2();
        animal2.eat();

        Dog2 dog2 = new Dog2();
        dog2.eat();
        dog2.barks();

        Cat cat = new Cat();
        cat.meow();
        cat.eat();


    }
}