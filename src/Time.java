import java.time.LocalTime;

public class Time {
    public static void main(String[] args) {
        LocalTime time1 = LocalTime.of(15, 20, 40);
        LocalTime time2 = LocalTime.of(10, 30, 50);

        // isAfter() method
        if(time1.isAfter(time2)) {
            System.out.println(time1 + " is after " + time2);
        }

        // isBefore() method
        if(time1.isBefore(time2)) {
            System.out.println(time1 + " is before " + time2);
        }

        // compareTo() method
        int diff = time1.compareTo(time2);
        if(diff > 0) {
            System.out.println(time1 + " is greater than " + time2);
        } else if (diff < 0) {
            System.out.println(time1 + " is less than " + time2);
        } else {
            System.out.println(time1 + " is equal to " + time2);
        }
    }
}