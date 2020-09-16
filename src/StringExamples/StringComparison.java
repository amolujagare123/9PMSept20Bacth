package StringExamples;

public class StringComparison {

    public static void main(String[] args) {

        String str1 ="amol";
        String str2 ="amol";
        String str3 ="Amol";
        String str4 ="yash";
        String str5 =new String("amol");

        int a=10;
        int b=11;

       // System.out.println(b==a);
        // == is an operator used to compare 2 variables of any datatypes
        // string is a class & class variables are objects

        System.out.println(str1.equals(str2) ) ;// true
        System.out.println(str1.equals(str3) ) ;// false
        System.out.println(str1.equals(str4) ) ;// false
        System.out.println(str1.equals(str5) ) ;// true
        System.out.println(str1.equalsIgnoreCase(str3));

        System.out.println(str1==str2); // compares the addresses
        // true
        System.out.println(str1==str5); // false



    }

}
