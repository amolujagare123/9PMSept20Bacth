package DateDemos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

    public static void main(String[] args) throws ParseException {

        String str = "23/10/2019" ;

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

        Date date = sd.parse(str); // it will return a date

        System.out.println(date); // this will print the date in string in the system formatted date


        String dateStr0= "23-June-2016"; //=========> dd-MMMM-yyyy

        SimpleDateFormat sd0 = new SimpleDateFormat("dd-MMMM-yyyy");
        Date date0 = sd0.parse(dateStr0);
        System.out.println(date0);

        String dateStr1= "23 | June 16  8:34";//====> dd | MMMM yy h:mm

        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy h:mm");
        Date date1 = sd1.parse(dateStr1);
        System.out.println(date1);


        String dateStr2= "2016 - 06 - 23 | 8:34:23"; //=> yyyy - MM - dd | h:mm:ss

        SimpleDateFormat sd2 = new SimpleDateFormat("yyyy - MM - dd | h:mm:ss");
        Date date2 = sd2.parse(dateStr2);
        System.out.println(date2);
    }
}
