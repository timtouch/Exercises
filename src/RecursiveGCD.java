/**
 * Created by Timothy on 12/19/2016.
 */
public class RecursiveGCD {
    public static void main(String[] args) {
        System.out.println(gdc(10,25));
    }

    public static int gdc(int x, int y){
        if(y != 0){
            return gdc(y, x % y);
        }
        return x;
    }
}
