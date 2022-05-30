import java.time.*;
import java.time.DayOfWeek;
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        // Set a local date whose day is found
        LocalDate localDate
            = LocalDate.of(year,month, day);
  
        // Find the day from the local date
        DayOfWeek dayOfWeek
            = DayOfWeek.from(localDate);
        String result = dayOfWeek.name().toLowerCase();
        return result.substring(0,1).toUpperCase() + result.substring(1);
    }
}
