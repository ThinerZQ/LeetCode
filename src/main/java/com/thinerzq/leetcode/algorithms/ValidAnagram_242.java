package com.thinerzq.leetcode.algorithms;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/2/23
 * Time: 11:04
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class ValidAnagram_242 {
    public static void main(String[] args) {

        System.out.println(isAnagram_another("a", "a"));
    }

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        } else {
            char[] schars = s.toCharArray();
            char[] tchars = t.toCharArray();

            Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
            for (char temp : schars) {
                if (map.get(temp) != null) {
                    map.put(temp, map.get(temp) + 1);
                } else {
                    map.put(temp, 1);
                }
            }
            for (char temp : tchars) {
                if (map.get(temp) != null) {
                    map.put(temp, map.get(temp) - 1);
                } else {
                    map.put(temp, 1);
                }
            }

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1 || entry.getValue() < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isAnagram_another(String s, String t) {

        if ("".equals(s) && "".equals(t)) {
            return true;
        } else if ("".equals(s) || "".equals(t)) {
            return false;
        } else {
            if (s.length() != t.length()) {
                return false;
            } else {
                char[] schars = s.toCharArray();
                char[] tchars = t.toCharArray();
                int s_mutil = 1;
                int t_mutil = 1;
                int s_sum = 0;
                int t_sum = 0;
                for (int i = 0; i < s.length(); i++) {
                    int schar = schars[i];
                    int tchar = tchars[i];
                    s_mutil *= schar;
                    t_mutil *= tchar;
                    s_sum += schar;
                    t_sum += tchar;
                }
                if (s_sum != t_sum || s_mutil != t_mutil) {
                    return false;
                }
            }
        }
        return true;
    }
}
