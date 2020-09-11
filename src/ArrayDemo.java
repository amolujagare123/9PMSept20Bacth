public class ArrayDemo {

    public static void main(String[] args) {


        int[]  a = new int[5] ;

        a[0] = 67;
        a[1] = 32;
        a[2] = 647;
        a[3] = 617;
        a[4] = 167;

      //  System.out.println(a[4]);


        int l = a.length;

     /*   for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }*/

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }
}
