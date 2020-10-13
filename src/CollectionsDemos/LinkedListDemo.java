package CollectionsDemos;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();

        ll.add("praful");
        ll.add("usha");
        ll.add("amol");
        ll.add("rahul");
        ll.add("mehul");

        System.out.println(ll);

        ll.addFirst("First");
        ll.addLast("Last");

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);

        Iterator itr = ll.descendingIterator();

        while(itr.hasNext())
            System.out.println(itr.next());
    }

}
