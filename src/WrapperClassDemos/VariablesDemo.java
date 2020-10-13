package WrapperClassDemos;

public class VariablesDemo {

    public static void main(String[] args) {

       /* byte  b = -129;

        Short s = -32769;*/

        boolean b1 = true;
        boolean b2 = false;

        char c = '#';


        int i = 10;

        Integer ii = new Integer(10);
        Integer ii1 = new Integer(i); // wrapping or boxing

        Integer ii2 = 10;
        Integer ii3 = i; // auto wrapping or auto boxing


        int a1 = ii.intValue();

        System.out.println(a1);

        int a2 = ii;
        System.out.println(a2);

        for(Integer j =0 ;j<10 ;j++)
            System.out.println(j);

    }
}
