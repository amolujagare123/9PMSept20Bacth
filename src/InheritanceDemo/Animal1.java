package InheritanceDemo;

public class Animal1 {

    void  eat()
    {
        System.out.println("eat");
    }

}

class Dog1 extends Animal1
{
    void barks()
    {
        System.out.println("barks");
    }

}

class BabyDog extends Dog1
{
    void weeps()
    {
        System.out.println("weeps");
    }
}

class TestInheritance2
{
    public static void main(String[] args) {
        Animal1 animal1 = new Animal1();
        animal1.eat();

        Dog1 dog1 = new Dog1();
        dog1.barks();
        dog1.eat();

        BabyDog babyDog = new BabyDog();
        babyDog.weeps();
        babyDog.barks();
        babyDog.eat();


    }
}