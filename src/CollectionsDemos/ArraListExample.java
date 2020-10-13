package CollectionsDemos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraListExample {

    public static void main(String[] args) {

        ArrayList al  = new ArrayList();

        al.add("praful");
        al.add("usha");
        al.add("amol");
        al.add("rahul");
        al.add("mehul");

        System.out.println(al);

        ArrayList al2 = new ArrayList();

        al2.add("abc1");
        al2.add("abc2");
        al2.add("rahul");
        al2.add("mehul");

       // al.addAll(al2);

       // System.out.println(al);

        al.removeAll(al2);
        // all the elements in al2 which are present in al will be removed

        System.out.println(al);

    }
}
