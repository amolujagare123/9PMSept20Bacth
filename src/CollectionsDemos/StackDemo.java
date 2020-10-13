package CollectionsDemos;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack  stack = new Stack();

        System.out.println(stack.empty()); //true

        stack.push(12);
        stack.push(11);
        stack.push(22);
        stack.push(23);
        stack.push(92);
        System.out.println(stack.empty()); //false
        System.out.println(stack);

        /*System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);*/


        System.out.println(stack.peek());
        System.out.println(stack);

        System.out.println(stack.search(123));

        System.out.println(stack.search(12));
    }

}
