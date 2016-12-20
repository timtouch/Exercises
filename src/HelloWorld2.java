/**
 * Created by timtouch on 12/18/16.
 */
public class HelloWorld2 {
    public static void main (String[] args){
        String word1;
        String word2, sentence;
        word1 = "Hello, ";
        word2 = "world!";
        sentence = word1.concat(word2);
        System.out.println(sentence);
        System.out.println('\u0007');
    }
}
