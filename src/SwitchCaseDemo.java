public class SwitchCaseDemo {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int result;

        int choice = 4;

        switch(choice)
        {
            case 1 : result = a + b ;
                System.out.println("Addition="+result);
                break;
            case 2 : result = a -b;
                System.out.println("substraction="+result);
                break;
            case 3 : result = a / b;
                System.out.println("Division="+result);
                break;
            case 4 : result = a * b;
                System.out.println("Multiplication="+result);
                break;
        }


    }

}
