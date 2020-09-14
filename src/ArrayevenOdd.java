public class ArrayevenOdd {
    public static void main(String[] args) {

        int[] a = new int[10];

        a[0] = 78;
        a[1] = 45;
        a[2] = 456;
        a[3] = 45;
        a[4] = 345;
        a[5] = 178;
        a[6] = 452;
        a[7] = 46;
        a[8] = 451;
        a[9] = 245;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
                System.out.println(a[i]+" Even");
            else
                System.out.println(a[i]+" Odd");
        }



    }



}
