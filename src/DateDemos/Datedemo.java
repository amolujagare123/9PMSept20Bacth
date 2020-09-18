package DateDemos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datedemo {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

        String dateStr= sd.format(date);
         // this will written the value of date in the above format as a string
        System.out.println(dateStr);

        // 1. dd-MMMM-yyyy

        SimpleDateFormat sd1 = new SimpleDateFormat("dd-MMMM-yyyy");
        String str1 = sd1.format(date);
        System.out.println(str1);

      //2.  dd | MMMM yy h:mm
        SimpleDateFormat sd2 = new SimpleDateFormat("dd | MMMM yy h:mm");
        String str2 = sd2.format(date);
        System.out.println(str2);

      //3.  yyyy - MM - dd | h:mm:ss

        SimpleDateFormat sd3 = new SimpleDateFormat("yyyy - MM - dd | h:mm:ss");
        String str3 = sd3.format(date);
        System.out.println(str3);

    }
}
