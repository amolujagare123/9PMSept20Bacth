public class TwoDArray2 {

    public static void main(String[] args) {

        int[][] starr =  {
                {1,1,1},
                {2,2,2},
                {3,3,3},
                {4,4,4},

        }  ;                 // 4 , 3

        for(int i=0;i<starr.length;i++)
        {
            for (int j=0;j<starr[0].length;j++)
            {
                System.out.print(starr[i][j]+" ");
            }
            System.out.println();
        }




    }

}
