package InheritanceDemopack;

public class Animal1 {

    void eat()
    {
        System.out.println("Animal eats");
    }
}

class Dog1 extends Animal1
{
    void barks()
    {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal1
{
    void meow()
    {

        System.out.println("cat meows");
    }
}

class Babycat extends Cat
{
    void weep()
    {
        System.out.println("Babycat weeps");
    }
}

class testInheritance2
{
    public static void main(String[] args) {
        Animal1 animal1 = new Animal1();
        Dog1 dog1 = new Dog1();
        Cat cat = new Cat();

        animal1.eat();

        dog1.barks();
        dog1.eat();

        cat.meow();
        cat.eat();

        Babycat babycat = new Babycat();
        babycat.weep();
        babycat.meow();
        babycat.eat();


    }
}
