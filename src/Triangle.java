public class Triangle {

    public static void main(String[] args) {
        int a = 90;
        int b = 90;
        int c = 0;  // angles of a triangle

       if(a+b+c==180 && a>0 && b>0 && c>0) {

           // 1. equilateral triangle
           if (a == b && b == c)
               System.out.println("Equilateral triangle");
           // 2. scalane triangle
           if (a != b && b != c && c != a)
               System.out.println("Scalane triangle");

           // 3. right angle triangle
           if (a == 90 || b == 90 || c == 90)
               System.out.println("Right angled triangle");

           // 3. isolscalence triangle
           if ((a == b && b != c) || (b == c && c != a) || (c == a && a != b))
               System.out.println("Isosclance triangle");
       }
       else
           System.out.println("This is not a triangle");
    }
}
