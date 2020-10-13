package ExceptionsDemo;

public class Demo2 {
    public static void main(String[] args) {

        int[] a = new int[3];

        try {
            a[0] =8;
            a[1] =9;
            a[2] =4;
            a[3] = 6;
        }
        catch (Exception e)
        {
            System.out.println("inside catch");
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getClass());

            e.printStackTrace();

        }
        finally {
            System.out.println("inside finally");
        }

        System.out.println("length="+a.length);
        System.out.println("End of the program");

    }

}
