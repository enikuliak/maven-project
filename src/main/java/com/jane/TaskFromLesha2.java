package com.jane;

import java.util.*;

/**
 * Created by jane on 12/11/15.
 */
public class TaskFromLesha2 {

    public static List<String> getPopularPairs(String text, int k) {

        String str = text.trim();

        List<String> list = new ArrayList<>(Arrays.asList(str.split(" ")));

        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
            if (temp.equals(""))
                list.remove(i);
        }

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size() - 1; i++) {
            String string = list.get(i) + " " + list.get(i + 1);
            if (map.containsKey(string)) {
                map.put(string, map.get(string) + 1);
            } else {
                map.put(string, 1);
            }
        }

        List<String> list1 = new ArrayList<>();

        int max = 0;
        String word = "";

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
}

