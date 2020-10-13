package DateDemos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

        String dateStr = sd.format(date);

        System.out.println(dateStr);

        //Current Date into string...... format

        SimpleDateFormat sd1 = new SimpleDateFormat("dd-MMMM- yyyy");

        String dateStr1 = sd1.format(date);

        System.out.println(dateStr1);

        SimpleDateFormat sd2 = new SimpleDateFormat("dd | MMMM yy hh:mm");
        String dateStr2 = sd2.format(date);
        System.out.println(dateStr2);

        SimpleDateFormat sd3 = new SimpleDateFormat("EEEE yyyy/MM/dd");
        String dateStr3 = sd3.format(date);
        System.out.println(dateStr3);


        SimpleDateFormat sd4 = new SimpleDateFormat("dd-MM-yyyy | E | hh:MM");
        String dateStr4 = sd4.format(date);
        System.out.println(dateStr4);


    }
}
