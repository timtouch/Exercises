/**
 * Created by timtouch on 12/18/16.
 */
public class Rectangle {
    int width, length;
    public Rectangle(int width, int length){
        this.width = width;
        this.length = length;
    }

    public int getWidth(){
        return width;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void printRectangle(){
        for(int i = 0; i < length; i++){
            for(int j = 0; j < width; j++){
                if(i == 0 || i == length - 1){
                    System.out.print('*');
                } else {
                    if (j == 0 || j == width - 1){
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                }
            }
            System.out.println();
        }
    }
}
