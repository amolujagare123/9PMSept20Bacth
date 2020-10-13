package CollectionsDemos;

import java.util.Vector;

public class VectorDemo2 {

    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();

        System.out.println("capacity="+v.capacity()); // 10
        System.out.println("Size="+v.size()); // 0


        v.add(34);
        v.add(44);
        v.add(54);
        v.add(14);
        v.add(24);
        v.add(34);
        v.add(44);
        v.add(54);
        v.add(14);
        v.add(24);
        v.add(24);

        System.out.println(v);

        System.out.println("capacity="+v.capacity()); //
        System.out.println("Size="+v.size()); //

        v.add(34);
        v.add(44);
        v.add(54);
        v.add(14);
        v.add(24);
        v.add(34);
        v.add(44);
        v.add(54);
        v.add(14);
        v.add(24);
        v.add(24);

        System.out.println("capacity="+v.capacity()); //
        System.out.println("Size="+v.size()); //
    }
}
