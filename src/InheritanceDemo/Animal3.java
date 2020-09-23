package InheritanceDemo;

public class Animal3 {

    void animalMethod()
    {
        System.out.println("I am animal");
    }
}

class Mamal extends Animal3
{
    void mamalMethod()
    {
        System.out.println("I am mamal");
    }
}

class Reptile extends Animal3
{
    void reptileMethod()
    {
        System.out.println("I am reptile");
    }
}

class Tiger extends Mamal
{
    void tigerMethod()
    {
        System.out.println("I am Tiger");
    }
}

class TestInheritance4
{
    public static void main(String[] args) {

        Animal3 animal3 = new Animal3();
        animal3.animalMethod();

        Mamal mamal = new Mamal();
        mamal.mamalMethod();
        mamal.animalMethod();

        Reptile reptile = new Reptile();
        reptile.reptileMethod();
        reptile.animalMethod();

        Tiger tiger = new Tiger();
             tiger.tigerMethod();
             tiger.mamalMethod();
             tiger.animalMethod();


    }
}