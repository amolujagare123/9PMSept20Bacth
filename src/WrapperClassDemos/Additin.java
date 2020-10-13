package WrapperClassDemos;

public class Additin {

    public static void main(String[] args) {

        String str1 = "123";
        String str2 = "17";

        System.out.println(str1+str2);

        int a1 = Integer.parseInt(str1);
        int a2 = Integer.parseInt(str2);

        System.out.println(a1+a2);

        String str3 = "123.23";
        String str4 = "17.34";
        System.out.println(str3+str4);

        Double d1 = Double.parseDouble(str3);
        Double d2 = Double.parseDouble(str4);

        System.out.println(d1+d2);

        Boolean.parseBoolean("") ; // converts bollean value
        Float.parseFloat("");


        String str = "a";

        // how to convert a single charcter string into character

       Character ch =  str.charAt(0);

    }
}
