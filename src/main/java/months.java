class months {

/*
This class presents a message to the end user by presenting a message to the end user.
The message retrieves data created in the particular method that provides name of the month and no of days in the month.
Then once the detail is provided, everything else within the message gets calculated
based on calculations present in the methods that are in the ClassB.
 */

    aMonth defineAMonth = new aMonth();

    public void foreword() {

        System.out.println("This is my first calendar, using three classes and Page Object Model.");
        System.out.println("Let's start listing moths;");
        System.out.println();

    }

    public void message() {

        System.out.println("In the " + defineAMonth.nameOfTheMonth + " there is " + defineAMonth.daysInTheMonth + " days.");
        System.out.println("Each " + defineAMonth.nameOfTheMonth + " consists of " + defineAMonth.hoursInAMonth() + " hours, \n" +
                "which then gives " + defineAMonth.minutesInAMonth() + " minutes, and finally, there is " + defineAMonth.secondsInAMonth() + " seconds.");
        System.out.println("____________________________________________________________________________________________");

    }

    public void January() {

        defineAMonth.nameOfTheMonth = "January";
        defineAMonth.daysInTheMonth = 31;
        message();

    }

    public void February() {

        defineAMonth.nameOfTheMonth = "February";
        defineAMonth.daysInTheMonth = 28;
        message();

    }

    public void March() {

        defineAMonth.nameOfTheMonth = "March";
        defineAMonth.daysInTheMonth = 31;
        message();

    }

    public void April() {

        defineAMonth.nameOfTheMonth = "April";
        defineAMonth.daysInTheMonth = 30;
        message();

    }

    public void May() {

        defineAMonth.nameOfTheMonth = "May";
        defineAMonth.daysInTheMonth = 31;
        message();

    }

    public void June() {

        defineAMonth.nameOfTheMonth = "June";
        defineAMonth.daysInTheMonth = 30;
        message();

    }

    public void July() {

        defineAMonth.nameOfTheMonth = "July";
        defineAMonth.daysInTheMonth = 31;
        message();

    }

    public void August() {

        defineAMonth.nameOfTheMonth = "August";
        defineAMonth.daysInTheMonth = 31;
        message();

    }

    public void September() {

        defineAMonth.nameOfTheMonth = "September";
        defineAMonth.daysInTheMonth = 30;
        message();

    }

    public void October() {

        defineAMonth.nameOfTheMonth = "October";
        defineAMonth.daysInTheMonth = 31;
        message();

    }

    public void November() {

        defineAMonth.nameOfTheMonth = "November";
        defineAMonth.daysInTheMonth = 30;
        message();

    }

    public void December() {

        defineAMonth.nameOfTheMonth = "December";
        defineAMonth.daysInTheMonth = 31;
        message();

    }

}
