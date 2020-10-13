package DateDemos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

    public static void main(String[] args) throws ParseException {

        String dateStr = "12/10/2019";

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

        // convert String into date .... parse

        Date date = sd.parse(dateStr);

        System.out.println(date);

        String dateStr0= "23-June- 2016"; //---> dd-MMMM- yyyy

        SimpleDateFormat sd0 = new SimpleDateFormat("dd-MMMM- yyyy");

        Date date0 = sd0.parse(dateStr0);
        System.out.println(date0);


        String dateStr1= "23 | June 16  8:34";//--> dd | MMMM yy hh:mm
        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy hh:mm");
        Date date1= sd1.parse(dateStr1);
        System.out.println(date1);


        String dateStr2= "2016 - 06 - 23 | 8:34:23" ;//--->Homework

        String dateStr3= "Thursday 2016/06/23";//----> EEEE yyyy/MM/dd

        SimpleDateFormat sd3 = new SimpleDateFormat("EEEE yyyy/MM/dd");
        Date date3 = sd3.parse(dateStr3);
        System.out.println(date3);


        String dateStr4= "23-06-2016 | thu | 8:34";//---> dd-MM-yyyy | E | hh:MM
       SimpleDateFormat sd4 = new SimpleDateFormat("dd-MM-yyyy | E | hh:MM");
       Date date4 = sd4.parse(dateStr4);
        System.out.println(date4);

        String dateStr5= "8:34:22"; //--->Homework

    }

}
