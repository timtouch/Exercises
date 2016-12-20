import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by Timothy on 12/19/2016.
 */
public class RecursiveTriangle {
    int base;

    public RecursiveTriangle (int base){
        this.base = base;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public static void printBase (int base){
        for (int i = 0; i < base; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printRecursiveTriangle(int base){
        if(base == 0) {
            return;
        } else {
            printBase(base);
            printRecursiveTriangle(base - 1);
            printBase(base);
        }
        return;
    }

    public static void printRecursivePyramid(int base, int maxBase){
        if(base > maxBase){
            return;
        } else {
            printBase(base);
            printRecursivePyramid(base + 1, maxBase);
            printBase(base);
        }
        return;
    }

    public static void printRecursiveDiamond(int base, int maxBase){
        if(base > maxBase){
            return;
        } else {

            printRecursiveDiamond(base + 1, maxBase);
        }
    }

    public static void printDiamondBase(int base, int maxBase){
        for (int i = 0; i < base; i++) {
            System.out.print(" ");
        }
        printBase(maxBase - base);
    }
}
