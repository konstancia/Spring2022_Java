package Class2;

public class Homework1 {



        /**
         * Due: March 6th Sunday
         *
         * Store values for below scenario in an appropriate variable, and pring the same in Console.
         * 1. number of hours in a day - byte
         * 2. max no. of days in a year - short
         * 3. total number of employees in an organization - long
         * 4. Population in a country - long
         * 5. Mortgage Rates - double
         * 6. Balance in bank account - float
         * 7. Does the sun rise from the West? Boolean
         * 8. Initials of your name (Use: char)  //My initials are DP
         * 9. Store your full name (Use: String)
         *
         */

        public static void main(String[] args){

            byte numberOfHoursInDay = 24;
            System.out.println("Number of hours in a day --> " + numberOfHoursInDay);

            short numberOfDaysInYear = 365;
            System.out.println("Number of days in a year --> " + numberOfDaysInYear);

            long numberOfEmployees = 1000;
            System.out.println("Number of Employees is " + numberOfEmployees);

            long populationInCountryUsa = 329000000;
            System.out.println("Population in USA --> " + populationInCountryUsa + " million");

            double mortgageRates = 4.7;
            System.out.println("Mortgage rates are " + mortgageRates + " percent");

            float bankAccountBalance = 5000.05f;
            System.out.println("Bank account balance is $" +bankAccountBalance);

            boolean doesTheSunRiseFromWest = false;
            System.out.println("Does the sun rise from the west? " + doesTheSunRiseFromWest);

            String nameInitials = "KM";
            System.out.println("My initials are " + nameInitials);

            String myFullName = "Konstancia Milova";
            System.out.println("My full name is " + myFullName);


        }
}
