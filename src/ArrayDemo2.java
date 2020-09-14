public class ArrayDemo2 {

    public static void main(String[] args) {


        float[] f = new float[5];

        f[0] = 1.2f ;
        f[1] = 4.2f ;
        f[2] = 5.2f ;
        f[3] = 12.78f ;
        f[4] = 89.09f ;

        for(int i=0; i<f.length;i++)
            System.out.println(f[i]);


        char[] c = new char[5];
        c[0] = 'h';
        c[1] = 't';
        c[2] = 'i';
        c[3] = '4';
        c[4] = ' ';

        for(int i=0; i<c.length;i++)
            System.out.println(c[i]);
    }
}
