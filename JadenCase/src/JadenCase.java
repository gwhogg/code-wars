import java.util.Arrays;
import java.util.List;

public class JadenCase {

    public static void main(String[] args) {
        String output = toJadenCase("How can mirrors be real if our eyes aren't real");
        System.out.println(output);
    }

    public static String toJadenCase(String phrase) {
        if(phrase == null || phrase.isEmpty()) {
            return null;
        } else {
            String result = "";
            List<String> words = Arrays.asList(phrase.split(" "));
            for (String word:words) {
                result += word.substring(0,1).toUpperCase() + word.substring(1) + " ";
            }
            return result.trim();
        }
    }
}