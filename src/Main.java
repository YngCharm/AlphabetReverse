import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static final HashMap<Character, Integer> changeOnNum = new HashMap<>() {{
        put('a', 1);
        put('e', 5);
        put('i', 9);
        put('o', 15);
        put('u', 21);
        put('y', 25);

        put('а', 1);
        put('е', 6);
        put('ё', 7);
        put('и', 10);
        put('о', 16);
        put('у', 21);
        put('ы', 29);
        put('э', 31);
        put('ю', 32);
        put('я', 33);
    }};

    public static String transformString(String start) {
        if (start.length() <= 2) {
            return start;
        }

        StringBuilder result = new StringBuilder();
        for (int i = start.length() - 1; i >= 0; i--) {
            char c = start.charAt(i);
            if (changeOnNum.containsKey(c)) {
                result.append(changeOnNum.get(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String end = scanner.nextLine();
        System.out.println(transformString(end));
    }
}