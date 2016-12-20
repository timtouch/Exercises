/**
 * TODO: Finish this class
 * Created by timtouch on 12/19/16.
 */
public class Roman {
    /*
    * Store number as a Roman numeral
    * Convert and store the number into decimal places
    * Print the number as a Roman numeral or decimal number as requested by the user
    * */

    int number;
    String numeral;
    public Roman(int number){
        this.number = number;
        this.numeral = numberToNumeral(number);
    }

    public int getNumber() {
        return number;
    }

    public String getNumeral(){
        return numeral;
    }

    public static String numberToNumeral(int remainder){
        String numeral = "";
        /*
            Equivalencies
            M       1000
            D       500
            C       100
            L       50
            X       10
            V       5
            I       1

            Ex: 19 => XIX
            Special Cases:
                4 = IV
                9 = IX
                etc...

            Algorithm:
                Find the highest digit and work downward
                num / 1000 = # Ms
                num % 1000 = remainder
                Append the characters to the start
                Get the remainder
                Test for the next smallest case

                Watch out for the "Special Cases"
         */
        while(remainder != 0){
            if (remainder / 1000 > 0){
                for (int i = 0; i < (remainder / 1000); i++) {
                    numeral += "M";
                }
                remainder = remainder % 1000;
            } else if (remainder / 500 > 0){
                for (int i = 0; i < (remainder / 500); i++) {
                    numeral += "D";
                }
                remainder = remainder % 500;
            } else if (remainder / 100 > 0){
                for (int i = 0; i < (remainder / 100); i++) {
                    numeral += "C";
                }
                remainder = remainder % 100;
            } else if (remainder / 50 > 0){
                for (int i = 0; i < (remainder / 50); i++) {
                    numeral += "L";
                }
                remainder = remainder % 50;
            } else if (remainder / 10 > 0){
                for (int i = 0; i < (remainder / 10); i++) {
                    numeral += "X";
                }
                remainder = remainder % 10;
            } else if (remainder / 5 > 0){
                for (int i = 0; i < (remainder / 5); i++) {
                    numeral += "V";
                }
                remainder = remainder % 5;
            } else if (remainder / 1 > 0){
                for (int i = 0; i < (remainder / 1); i++) {
                    numeral += "I";
                }
                remainder = remainder % 1;
            }


        }
        return numeral;
    }


}
