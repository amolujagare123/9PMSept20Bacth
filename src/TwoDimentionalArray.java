public class TwoDimentionalArray {

    public static void main(String[] args) {

        int[][] a = new int[3][4]; // 3 x 4 -> row x col

        a[0][0] = 21;
        a[0][1] = 26;
        a[0][2] = 13;
        a[0][3] = 23;

        a[1][0] = 33;
        a[1][1] = 43;
        a[1][2] = 53;
        a[1][3] = 37;

        a[2][0] = 123;
        a[2][1] = 231;
        a[2][2] = 223;
        a[2][3] = 232;

        int row = a.length;
        System.out.println("row="+row);

        int col = a[0].length;
        System.out.println("col="+col);

        for(int i=0;i<a.length ; i++)
        {
            for(int j= 0; j<a[0].length; j++)
            {
                System.out.print(a[i][j]+"\t\t");
            }

            System.out.println();
        }


       /* for(int i=0;i<row ; i++)
        {
            for(int j= 0; j<col; j++)
            {
                System.out.print(a[i][j]+"\t\t");
            }

            System.out.println();
        }*/

      /*  for(int i=0;i<3 ; i++)
        {
            for(int j= 0; j<4; j++)
            {
                System.out.print(a[i][j]+"\t\t");
            }

            System.out.println();
        }*/

    }
}
