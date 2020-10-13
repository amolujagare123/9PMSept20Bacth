public class TwodimentionalarrayDemo {

    public static void main(String[] args) {

        int[][] a = new int[5][3]; // row = 5 , col =3

        a[0][0] = 23;
        a[0][1] = 24;
        a[0][2] = 54;

        a[1][0] = 23;
        a[1][1] = 24;
        a[1][2] = 54;

        a[2][0] = 23;
        a[2][1] = 24;
        a[2][2] = 54;

        a[3][0] = 23;
        a[3][1] = 24;
        a[3][2] = 54;

        a[4][0] = 23;
        a[4][1] = 24;
        a[4][2] = 54;


        int row = a.length;
        int col = a[0].length;

        System.out.println("row="+row);
        System.out.println("col="+col);


        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]+" ");

            }
            System.out.println();

        }



    }
}
