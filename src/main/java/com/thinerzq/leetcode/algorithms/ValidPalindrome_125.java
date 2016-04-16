package com.thinerzq.leetcode.algorithms;

/**
 * Created by 60109 on 2016/3/25.
 * <p>
 * a-z：97-122
 * A-Z：65-90
 * 0-9：48-57
 */
public class ValidPalindrome_125 {
    public static void main(String[] args) {

        System.out.println(isPalindrome_1("aA"));
    }

    public static boolean isPalindrome(String s) {

        int j = s.length() - 1;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if ((c >= 97 && c <= 122) || (c >= 65 && c <= 90) || (c >= 48 && c <= 57)) {
                char temp = s.charAt(j);

                if (String.valueOf(temp).equalsIgnoreCase(String.valueOf(c))) {
                    j--;
                } else {
                    if (((temp >= 97 && temp <= 122) || (temp >= 65 && temp <= 90) || (temp >= 48 && temp <= 57))) {
                        return false;
                    }
                    while (!((temp >= 97 && temp <= 122) || (temp >= 65 && temp <= 90) || (temp >= 48 && temp <= 57))) {
                        temp = s.charAt(--j);
                    }
                    if (String.valueOf(temp).equalsIgnoreCase(String.valueOf(c))) {
                        j--;
                    }
                }
            }
        }

        return true;
    }

    public static boolean isPalindrome_1(String s) {

        int size = s.length() - 1;
        char[] chars = s.toCharArray();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i <= size; i++) {
            int c1 = chars[i];
            int c2 = chars[size - i];
            if ((c1 >= 97 && c1 <= 122) || (c1 >= 65 && c1 <= 90) || (c1 >= 48 && c1 <= 57)) {
                if ((c1 >= 97 && c1 <= 122)) {
                    sb1.append(c1 - 32);
                } else {
                    sb1.append(c1);
                }
            }
            if ((c2 >= 97 && c2 <= 122) || (c2 >= 65 && c2 <= 90) || (c2 >= 48 && c2 <= 57)) {
                if ((c2 >= 97 && c2 <= 122)) {
                    sb2.append(c2 - 32);
                } else {
                    sb2.append(c2);
                }
            }
        }


        System.out.println(sb1);
        System.out.println(sb2);
        return sb1.toString().equals(sb2.toString());
    }
}
