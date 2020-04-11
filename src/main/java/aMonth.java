public class aMonth {


      /*
    This class defines a month represented in time-frames.
    It will list the days, weeks, hours, minutes and seconds in a single month.

    The name of the month gets defined;
    Days in a month get defined;

    Hours in a month get calculated in a method;
    Minutes in a month get calculated in a method;
    Seconds in a month get calculated in a method;

    Nothing else is done in this class
     */


    String nameOfTheMonth;
    int daysInTheMonth;

    int hoursInAMonth() {

        return daysInTheMonth * 24;

    }

    int minutesInAMonth() {

        return hoursInAMonth() * 60;
    }

    int secondsInAMonth() {

        return minutesInAMonth() * 60;
    }

}