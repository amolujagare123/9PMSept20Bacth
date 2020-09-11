public class UnaryOperatorDemo {

    public static void main(String[] args) {

        int i = 10;

        System.out.println(i++); // 10
        System.out.println(i); // 11
        System.out.println(++i); // 12
        System.out.println(i); // 12
        /*
i++ ----> first statement is executed then there will be increment

++i ----> first there will be increment then statement is executed
        * */
        System.out.println(i--); // 12
        System.out.println(i);// 11
        System.out.println(--i);// 10
        System.out.println(i); // 10

    }
}
