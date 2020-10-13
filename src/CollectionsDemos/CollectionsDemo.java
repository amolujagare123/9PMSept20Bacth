package CollectionsDemos;

import java.util.ArrayList;

public class CollectionsDemo {

    public static void main(String[] args) {

        ArrayList al  = new ArrayList();

        al.add("praful");
        al.add("usha");
        al.add("amol");
        al.add("rahul");
        al.add("mehul");
        al.add("mehul");
        al.add(null);

        al.add(45);

        al.add('j');

        System.out.println("size="+al.size());
        System.out.println(al);

    }

}
