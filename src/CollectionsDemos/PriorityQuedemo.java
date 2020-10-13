package CollectionsDemos;

import java.util.PriorityQueue;

public class PriorityQuedemo {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(34);
        pq.add(14);
        pq.add(24);
        pq.add(31);
        pq.add(74);

        System.out.println(pq);

        // [14,24,31,34,74]
        // some complilers or operating systems doesnot support priority queue
        // hence the output seems tobe not sorted
        //[14, 31, 24, 34, 74]

        System.out.println(pq.poll()); // 14
        System.out.println(pq.poll()); // 24
        System.out.println(pq.poll()); // 31
        System.out.println(pq.poll());// 34
        System.out.println(pq.poll()); //74
    }
}
