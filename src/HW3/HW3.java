package HW3;

import java.util.*;

public class HW3 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            words.add("apple");
            words.add("lemon");
            words.add("melon");
            if (i % 2 == 0) {
                words.add("apple");
            }
            if (i == 3) {
                words.add("melon");
            }
        }
        System.out.println("After adding words to array we have: \n" + words);
        Set<String> setOfWords = new TreeSet<>(words);
        System.out.println("Unique words in our array: \n" + setOfWords);
        int count = 0;
        for (String s : setOfWords) {
            for (String m : words) {
                if (s.equals(m)) {
                    count++;
                }
            }
            System.out.printf("Word %s added %d times \n", s, count);
            count = 0;
        }


        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        telephoneDirectory.add(89995358, "Borisov");
        telephoneDirectory.add(89358235, "Blalarisov");
        telephoneDirectory.add(89995328, "Borisov");
        telephoneDirectory.add(82395582, "Borisolala");
        telephoneDirectory.add(82395582, "Blalarisov");
        telephoneDirectory.add(89358235, "Borilalaov");
        telephoneDirectory.get("Borisov");


























    }
}
