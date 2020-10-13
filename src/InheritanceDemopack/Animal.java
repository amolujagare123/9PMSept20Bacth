package InheritanceDemopack;

public class Animal {

void eat()
{
    System.out.println("Animal eats");
}

}

class Dog extends Animal
{
    void barks()
    {
        System.out.println("Dog barks");
    }

}

class  BabyDog extends Dog
{
    void weeps()
    {
        System.out.println("Babydog weeps");
    }
}


class  TestInheritance
{

    public static void main(String[] args) {

        Animal animal = new Animal();
        Dog dog = new Dog();
        BabyDog babyDog = new BabyDog();

        animal.eat();

        dog.barks();
        dog.eat();


        babyDog.weeps();
        babyDog.barks();
        babyDog.eat();

    }

}