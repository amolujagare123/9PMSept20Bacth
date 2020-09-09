public class Marks {

    public static void main(String[] args) {

        int marks =65 ;

        if(marks<40)
            System.out.println("fail");

        else if(marks>=40 && marks<50)
            System.out.println("pass");

        else if(marks>=50 && marks<60)
            System.out.println("Second Class");

        else if(marks>=60 && marks<66)
            System.out.println("First class");

        else if(marks>=66)
            System.out.println("Distinction");

    }


}
