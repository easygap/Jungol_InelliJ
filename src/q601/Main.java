package q601;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.next();

        sc.close();

        List<Character> lists = new ArrayList<>();

        for (int i = 0; i < sentence.length(); i++) {
            lists.add(sentence.charAt(i));
        }

        for (int i = 0; i < lists.size(); i++) {
            lists.add(0, lists.get(lists.size() - 1));
            lists.remove(lists.size() - 1);

            String strValue = lists.stream().map(String::valueOf).collect(Collectors.joining());
            System.out.println(strValue);
        }
    }
}