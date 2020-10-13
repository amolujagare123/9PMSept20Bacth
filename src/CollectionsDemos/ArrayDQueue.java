package CollectionsDemos;

import java.util.ArrayDeque;

public class ArrayDQueue {

    public static void main(String[] args) {

        ArrayDeque<String> adq = new ArrayDeque<>();

        adq.offer("praful");
        adq.offer("usha");
        adq.offer("amol");
        adq.offer("rahul");
        adq.offer("mehul");
        adq.offer("ashish");
        adq.offer("ashish");
      //  adq.offer(null); // not allowed
        System.out.println(adq);

        System.out.println(adq.offerFirst("First"));
        System.out.println(adq.offerLast("Last"));

        System.out.println(adq);

        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());

        System.out.println(adq);
    }

}
