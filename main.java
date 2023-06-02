import java.util.*;

public class Main {

    public static void main(String[] args) {
        String input = "abc abc ab abc ab acs acs";
        String[] words = input.split(" ");
        Set<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(words));
        String output = String.join(" ", uniqueWords);
        System.out.println(output);
    }
}
