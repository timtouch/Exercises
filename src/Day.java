/**
 * Created by timtouch on 12/19/16.
 * Store a day
 */
public class Day {
    private Days day;

    public Day(Days day){
        this.day = day;
    }

    public void setDay(Days day) {
        this.day = day;
    }

    public void printDay(){
        System.out.println(day.toString());
    }

    public Days getDay() {
        return day;
    }

    public Days getNextDay(){
        return getXDaysFromToday(1);
    }

    // Gets previous day by getting array of Days enum and getting the element behind it
    // Made it +6 because modulo of negative numbers are still negative
    public Days getPreviousDay(){
        return Days.values()[(day.ordinal() + 6) % 7];
    }

    public Days getXDaysFromToday(int numDays){
        if(numDays < 0){
            System.err.println("Number of Days must be positive");
            return null;
        }
        return Days.values()[(day.ordinal() + numDays) % 7];
    }

    @Override
    public String toString() {
        return day.toString();
    }
}

