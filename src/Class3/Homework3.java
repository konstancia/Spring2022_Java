package Class3;

public class Homework3 {
    public static void main(String[] args) {

        /**
         *
         * Due date: Mar 8 2022
         *
         * Refer for formula: https://www.rapidtables.com/convert/temperature/celsius-to-fahrenheit.html
         *
         * C -> F
         * C -> K
         *
         * F -> C
         * F -> K
         *
         * K -> C
         * K -> F
         *
         */

        /**
         * Convert degree-Celsius into deg-Fahrenheit
         *
         * fT = cT × 9/5 + 32
         *
         */
        double cTemp = 25.3;
        double fTemp = cTemp * 9/5 + 32;
        System.out.println("\n" + cTemp + "˚C is equal to " + fTemp + "˚F");

        /**
         * Convert degree-Celsius into deg-Kelvin
         *
         * kT = cT + 273.15
         *
         */

        double cTemp2 = 32.5;
        double kTemp = cTemp2 + 273.15;
        System.out.println("\n" +cTemp2 + "˚C is equal to " +kTemp + "˚K"); //use new variable - cTemp2
        System.out.println("\n" +cTemp + "˚C is equal to " +kTemp + "˚K"); //use existing variable - cTemp


        /**
         * Convert degree-Fahrenheit into deg-Celsius
         *
         * cT = (fT - 32) × 5/9
         *
         */

        double fTemp2= 80;
        double cTemp3 = (fTemp2 - 32) * 5/9;
        System.out.println("\n" +fTemp2 + "˚F is equal to " +cTemp3+  "˚C" );

        /**
         * Convert degree-Fahrenheit into deg-Kelvin
         *
         * kT = (fT + 459.67)× 5/9
         *
         */

        double fTemp3 = 100.5;
        double kTemp4 = (fTemp3+ 459.67)* 5/9;
        System.out.println("\n" +kTemp4+ "˚F is equal to " +fTemp3+ "˚K");

        /**
         * Convert degree-Kelvin into deg-Celsius
         *
         * cT = kT - 273.15
         *
         */

        double kTemp5 = 14.5;
        double cTemp5 = kTemp5 - 273.15;
        System.out.println("\n" +kTemp5+ "˚K is equal to " +cTemp5+ "˚C");

        /**
         * Convert degree-Kelvin into deg-Fahrenheit
         *
         * fT = kT × 9/5 - 459.67
         *
         */

        double kTemp6 = 100.01;
        double fTemp6 = kTemp6 * 9/5 - 459.67;
        System.out.println("\n" +kTemp6+ "˚K is equal to " +fTemp6+ "˚F" );

    }
}
