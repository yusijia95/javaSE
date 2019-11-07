package example.e02;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Time {
    public static void main(String[] args) {

        String birDate="1995-10-29";
        SimpleDateFormat dateForm = new SimpleDateFormat("yyyy年MM月dd日hh时mm分ss秒SSS毫秒");
        Date curDate = new Date();
        curDate.getTime();
//        String birStr=dateForm.format(birDate);
//        String curStr=dateForm.format(curDate);
        System.out.println(curDate.getTime());
//        System.out.println(curStr);
//        System.out.println(date.getTime());
//
//
//        String str = date2.format(date);
//        System.out.println(str);
    }
}
