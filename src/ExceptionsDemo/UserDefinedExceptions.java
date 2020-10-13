package ExceptionsDemo;

public class UserDefinedExceptions {

    public void myMethod(int a) throws Exception {
        // if a is having value 1 to 10 we are safe
        // else thow some exception
        if(a>=1 && a<=10)
            System.out.println("We are safe");
        else
            throw new Exception("we are at danger");
    }

    public static void main(String[] args) throws Exception {

        UserDefinedExceptions ob = new UserDefinedExceptions();

        System.out.println("start of the program");

        ob.myMethod(11);

        System.out.println("End of the program");

    }

}
