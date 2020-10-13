package CollectionsDemos;

import java.util.PriorityQueue;

public class PriorityQuedemo2 {

    public static void main(String[] args) { // remove, element , peek

        PriorityQueue<Integer> pq = new PriorityQueue<>();
     /*   System.out.println("using pq.element()");
        System.out.println(pq.element());*/

//        System.out.println(pq.remove());
        System.out.println(pq.poll());
        System.out.println("using peek="+pq.peek());
        pq.add(34);
        pq.add(14);
        pq.add(24);
        pq.add(31);
        pq.add(74);
        pq.add(74);
     //   pq.add(null); // null not allowed

        System.out.println(pq);

        System.out.println(pq.remove());

        System.out.println(pq);

        System.out.println(pq.peek());
        System.out.println(pq.element());

        System.out.println(pq);


    }
}
