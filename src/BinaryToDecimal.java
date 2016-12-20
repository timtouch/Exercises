/**
 * Created by Timothy on 12/19/2016.
 */
public class BinaryToDecimal {
    public static final String numbers[] = {"0", "1", "2", "3", "4", "5","6","7","8","9","A","B","C","D","E","F","G","H","I","J"};
    public static void main(String[] args) {
        decimalToBaseConversion(19, 20);
    }

    public static void decimalToBaseConversion(int dec, int base){
        if (dec != 0 ){
            decimalToBaseConversion(dec/base, base);
            System.out.print(numbers[dec % base]);
        }
    }
}