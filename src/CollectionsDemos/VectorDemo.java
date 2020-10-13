package CollectionsDemos;

import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();

        v.add(34);
        v.add(44);
        v.add(54);
        v.add(14);
        v.add(24);

        System.out.println(v);

        System.out.println(v.contains(44));

        System.out.println(v.firstElement());
        System.out.println(v.lastElement());

        Object[] a = v.toArray();

        System.out.println("--- array (converted) ---");

          for(int i=0;i<a.length;i++)
              System.out.println(a[i]);

    }

}
