package ExceptionsDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileDemo {

    public static void main(String[] args) throws FileNotFoundException {

       // try {
            FileInputStream fp = new FileInputStream("D:\\6pmbsdatch\\1hg.txt");
      /*  }
        catch(Exception e)
        {

        }*/
        //fp.getClass();
        System.out.println("End of the program");
    }
}
