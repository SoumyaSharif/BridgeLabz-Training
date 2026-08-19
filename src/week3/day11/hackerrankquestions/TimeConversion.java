package week3.day11.hackerrankquestions;

public class TimeConversion {

    class Result {

        /*
         * Complete the 'timeConversion' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts STRING s as parameter.
         */

        public static String timeConversion(String s) {
            // Write your code here
            String period = s.substring(s.length() - 2); // AM or PM
            int hour = Integer.parseInt(s.substring(0, 2));

            if (period.equals("AM")) {
                if (hour == 12) {
                    hour = 0;
                }
            } else { // PM
                if (hour != 12) {
                    hour = hour + 12;
                }
            }

            String newHour = String.format("%02d", hour);

            return newHour + s.substring(2, 8);

        }

    }

}
