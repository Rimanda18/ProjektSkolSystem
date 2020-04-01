package se.skola;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author rimazivkovic
 */
public class TheDate {
    private String theDate;

   public String showDate() {

        Date date = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        this.theDate = s.format(date);
        return theDate;
    }  
}
