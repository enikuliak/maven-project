package com.jane;

import java.util.*;

/**
 * Finds k popular words from given text.
 */
public final class PopularWords {

    public static List<String> getPopularWords(String text, int k) {

        List<String> list = new ArrayList<>(Arrays.asList(text.split(" ")));

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String words : list) {
            if (words.trim().isEmpty()) {
                continue;
            }
            Integer count = map.get(words);
            if (count == null)
                map.put(words, 1);
            else
                map.put(words, count + 1);
        }
        int max = 0;
        String word = "";
        List<String> list1 = new ArrayList<String>();

        while (k > 0) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() > max) {
                    max = entry.getValue();
                    word = entry.getKey();
                }
            }
            list1.add(word);
            map.remove(word);
            max = 0;
            k--;
        }
        return list1;
    }

    private PopularWords() {
    }
}
