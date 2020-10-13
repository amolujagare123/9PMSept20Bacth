package ExceptionsDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) throws ParseException {
        String dateStr= "12/10/2019";

        SimpleDateFormat sd = new SimpleDateFormat("dd/ MM/yyyy");

        Date date = sd.parse(dateStr);

        System.out.println(date);
        System.out.println("end of the program");

    }
}
