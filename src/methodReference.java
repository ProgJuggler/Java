import java.util.Arrays;
import java.util.List;

public class methodReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("a","b","c","d");

        List<String> result = names.stream().map(String :: toUpperCase).toList();
        System.out.println(result);
    }
}
