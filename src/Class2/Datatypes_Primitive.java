package Class2;

public class Datatypes_Primitive {
    public static void main (String[] args){
        /**
         * byte, short, int, long, float, double, char, boolean
         *
         */

        /**
         * byte: is a Primitive datatype
         *          can store only whole number ranging from -128 to 127
         *
         *
         */

        // Write code to store number of cars in your house (2)
        byte numberOfMyCars = 2;

        // Write code to store your current age (22)
        byte myCurrentAge = 22;

        //what is the datatype of myCurrentAge?
        //Ans: byte

        // change value in myCurrentAge to 30
        myCurrentAge = 30;   //replaced the old value (22) with new value (30)

        /**
         * short: is primitive datatype
         *          can store only whole number raging from -32, 768 to 32,767
         *
         */

        // Write code to store number if days in a year (365)
        short numberOfDaysInYear = 365;

        //Write code to store number of rooms in your house (10)
        short numberOfRooms = 10;
        byte numberOfGarages = 2;

        // Print the number of rooms and garages
        // Number of room s= 10 and number of garages = 2
        System.out.println("Number of rooms = "+numberOfRooms+" and number of garages ="+numberOfGarages+".");


        // Print the number of rooms and garages
        // Number of rooms= 10
        // number of garages = 2

        System.out.println("Number of rooms - "+numberOfRooms);
        System.out.println("Number of garages - "+numberOfGarages);

        System.out.println("Number of rooms - "+numberOfRooms+"\nNumber of garages = "+numberOfGarages);

        /**
         * int: is a primitive datatype
         *          can store only whole number ranging from -2,147,000,000 to 2, 147,000,000
         *
         * In general, we use int-variable to store whole number
         * By default, Java treats every whole number as int
         */

        int myDogAge = 14;
        System.out.println("My dog is " +myDogAge + " years old");   //My dog is 14 years old.

        int abc = 1000;

        /**
         * long: is a primitive datatype
         *          can store only whole number randing from
         *          -9,000,000,000,000,000,000 to 9,000,000,000,000,000,000
         * L is an indicator for Java to treat value as "long" instead "int"
         */

        long numOfRooms = 10;
        // 10(int-datatype) is store in long-variable

        long abcd = 12345678989888L;
        // value stored in abcd is 12345678989888

        /**
         * float: is a primitivee datatype
         *          can store value with decimal point
         *
         * By default, java treats decimal-point value as double
         *
         * f is an indicator for Java to treat value as "float" instead of "double"
         */

        float myHeight = 1.1f;
        //myHeight = 1.1
        System.out.println("\nMy height is " + myHeight);

        /**
         * double: is a primitive datatype
         *          can store value with decimal point
         *
         * By default, java treats decimal-point value as double
         *
         */

        double myWeight = 99;     //stores 99.00 in myWeight variable
        System.out.println("My weight is " + myWeight + " pounds");

        /**
         * char: is a primitive datatype
         *          can store a single character of anything
         *
         * value must be enclosed in single-quotes
         *
         */
        char grade ='A';
        // char   char

        char dollarSymbol = '$';

        char gear = 'P';

        char firstNum = '1';
        System.out.println("Count start with " + firstNum);

        /**
         * boolean: is a primitive datatype
         *          can store either true or false
         *
         * true/false are keyword in java
         *
         */

        boolean isVaccinated = true;
        System.out.println("\nam I vaccinated? --> " + isVaccinated);

         boolean isItRaining = false;
         System.out.println("is it raining currently? -->" + isItRaining);

    }
}
