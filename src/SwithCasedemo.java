public class SwithCasedemo {

    public static void main(String[] args) {

        int a =10;
        int b = 5;
        int c;

        String choice ="div";

        switch (choice)
        {
            case "add" : c = a+b ;
                System.out.println("Addition :"+c);
                break;

            case "sub" : c = a-b;
                System.out.println("substraction :"+c);
                break;

            case "mul" : c = a * b;
                System.out.println("Multiplication :"+c);
                break;

            case "div": c = a/b;
                System.out.println("division :"+c);
                break;

        }



    }

}
