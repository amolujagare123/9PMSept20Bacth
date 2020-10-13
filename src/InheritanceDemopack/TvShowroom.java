package InheritanceDemopack;

public class TvShowroom {

    void channels()
    {
        System.out.println("Tv show room channels");
    }

    void settings()
    {
        System.out.println("Tv show room settings");
    }

    void VolumeControl()
    {
        System.out.println("Tv show room  VolumeControl");
    }

    void display()
    {
        System.out.println("display show room");
    }
}

class LG extends  TvShowroom
{
    void channels()
    {
        System.out.println("LG  channels");
    }

    public void settings()
    {
        System.out.println("LG settings");
    }

    void VolumeControl()
    {
        System.out.println("LG  VolumeControl");
    }
}

class Samsang extends  TvShowroom
{
    void channels()
    {
        System.out.println("Samsang  channels");
    }

    void settings()
    {
        System.out.println("Samsang settings");
    }

    void VolumeControl()
    {
        System.out.println("Samsang  VolumeControl");
    }
}

class Onida extends TvShowroom
{
    void channels()
    {
        System.out.println("Onida  channels");
    }

    void settings()
    {
        System.out.println("Onida settings");
    }

    void VolumeControl()
    {
        System.out.println("Onida  VolumeControl");
    }
}

class TestOverriding
{

    public static void main(String[] args) {

        // creating the reference variable of superclass

        TvShowroom tvShowroom  = new Onida(); // upcasting

        tvShowroom.channels();
        tvShowroom.settings();
        tvShowroom.VolumeControl();
        tvShowroom.display();

        tvShowroom = new LG();
        tvShowroom.channels();
        tvShowroom.settings();
        tvShowroom.VolumeControl();

        tvShowroom = new Samsang();
        tvShowroom.channels();
        tvShowroom.settings();
        tvShowroom.VolumeControl();

    }
}
