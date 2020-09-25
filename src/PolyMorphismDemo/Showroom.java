package PolyMorphismDemo;

public class Showroom {

    void volumeControl()
    {
        System.out.println("Showroom volume control");
    }

    void channels()
    {
        System.out.println("Showroom channels");
    }

    void setting()
    {
        System.out.println("Showroom settings");
    }
}

class Samsang extends  Showroom
{
    void volumeControl()
    {
        System.out.println("Samsang volume control");
    }

    void channels()
    {
        System.out.println("Samsang channels");
    }

    void setting()
    {
        System.out.println("Samsang settings");
    }
}

class LG extends  Showroom
{
    void volumeControl()
    {
        System.out.println("LG volume control");
    }

    void channels()
    {
        System.out.println("LG channels");
    }

    void setting()
    {
        System.out.println("LG settings");
    }
}

class Onida extends  Showroom
{
    void volumeControl()
    {
        System.out.println("Onida volume control");
    }

    void channels()
    {
        System.out.println("Onida channels");
    }

    void setting()
    {
        System.out.println("Onida settings");
    }
}

class  TestOverriding
{
    public static void main(String[] args) {

        Showroom ob = new Samsang();

        ob.volumeControl();
        ob.channels();
        ob.setting();

        ob = new LG();

        ob.volumeControl();
        ob.channels();
        ob.setting();

        ob = new Onida();

        ob.volumeControl();
        ob.channels();
        ob.setting();



    }
}
