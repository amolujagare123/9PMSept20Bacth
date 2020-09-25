package Misceleneous;

public class ReturningValues {

    int getTheValueInt()
    {
        int a = 15;

        return a;
    }

    double getMydouble()
    {
        double d = 89.6;

        return  d;
    }

    String getMyString()
    {
        String str = "Komal";

        return  str;
    }

    double[] getMydoubleArray()
    {
        double[] d = {1.1,2.2,3.4,4.3,11.2,56.3};

        return  d;
    }


    String[][] getMy2dstring()
    {
        String[][] ss = {
                {"abc1","pqr1","xyz1"},
                {"abc2","pqr2","xyz2"},
                {"abc3","pqr3","xyz3"},
                {"abc4","pqr4","xyz4"}
        };

        return  ss;
    }


    public static void main(String[] args) {

        ReturningValues ob = new ReturningValues();
        int a = 10;
        System.out.println(a);
        int x = a;
        System.out.println(x);
           int y =  ob.getTheValueInt();
        System.out.println(y); //15
        System.out.println(ob.getTheValueInt());//15


        double d1 = ob.getMydouble();
        System.out.println(d1);

        String ss = ob.getMyString();
        System.out.println(ss);


        double[] dd1 = ob.getMydoubleArray();

        for(int i = 0 ; i<dd1.length;i++)
            System.out.print(dd1[i]+" ");

        System.out.println();
        String[][] sArr = ob.getMy2dstring();

        for(int i=0; i<sArr.length;i++)
        {
            for(int j =0;j<sArr[0].length;j++)
            {
                System.out.print(sArr[i][j]+"\t\t");
            }
            System.out.println();
        }




    }

}
