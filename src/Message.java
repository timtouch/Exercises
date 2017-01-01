/**
 * Created by Timothy on 1/1/2017.
 */
public class Message {
    public static void main(String[] args) {
        System.out.println("HELLO DEBRA!");
        printMessage(3);
        System.out.println("Goodbye.");
    }

    static void printMessage(int age){
        System.out.println("A message for you:  ");
        String ageMessage = (age == 1) ? "You are 1 year old!" : "You are " + age + " years old!";
        System.out.println(ageMessage);
        System.out.println("Have a nice day!\n");
    }
}
