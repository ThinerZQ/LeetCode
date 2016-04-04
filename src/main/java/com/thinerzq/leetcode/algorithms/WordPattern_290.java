package com.thinerzq.leetcode.algorithms;

import java.util.*;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/3/19
 * Time: 16:17
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class WordPattern_290 {

    public static void main(String[] args) {

        String pattern = "";
        String string = "beef";
        wordPattern_1(pattern, string);
    }

    public boolean wordPattern(String pattern, String str) {

        String[] patterns = pattern.split("");
        String[] strings = str.split(" ");

        int size = pattern.length() - 1;
        for (int i = 0; i < size / 2; i++) {
            if (patterns[i].equals(patterns[size - i]) && strings[i].equals(strings[size - i])) {

            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean wordPattern_1(String pattern, String str) {

        String[] patterns = pattern.split("");
        String[] strings = str.split(" ");

        if (patterns.length != strings.length) {
            return false;
        }

        Map<String, String> map = new HashMap<String, String>(16, 0.75f);
        int size = pattern.length() - 1;
        for (int i = 0; i <= size / 2; i++) {
            if (patterns[i].equals(patterns[size - i]) && strings[i].equals(strings[size - i])) {

                String temp = map.get(patterns[i]);
                if (temp == null) {
                    map.put(patterns[i], strings[i]);
                }
                temp = map.get(patterns[i]);
                if (!temp.equals(strings[i])) {
                    return false;
                }
            } else {
                if (size == 1) {
                    return true;
                }
                return false;
            }
        }
        Set<String> keyset = map.keySet();
        Set<String> valueset = new HashSet<String>();
        for (String s : keyset) {
            valueset.add(map.get(s));
        }
        return keyset.size() == valueset.size();
    }
}
