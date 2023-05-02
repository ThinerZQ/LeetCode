package com.thinerzq.leetcode.my100;

public class 最长回文串 {
    public static void main(String[] args) {

        String t = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedic" +
                "atedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpa" +
                "teaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogether" +
                "fangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenl" +
                "ivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongremembe" +
                "rwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughthe" +
                "rehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreasedd" +
                "evotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationuns" +
                "derGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        System.out.println(longestPalindrome(t));
    }


    public static int longestPalindrome(String s) {
        int[] c = new int[256];
        char[] ss = s.toCharArray();

        for (int i = 0; i < ss.length; i++) {
            c[ss[i]]+=1;
        }

        int n = 0;
        int max = 0;
        int index = 0;
        //找到最大值单值
        for (int i = 0; i < c.length; i++) {
            if (c[i]>max && c[i]%2==1){
                max =c[i];
                index = i;
            }
        }
        for (int i = 0; i < c.length; i++) {
// 其他单值都 -1
            if ( c[i]%2==1 && index!=i) {
                c[i] = c[i] -1;
            }
            //所有偶数相加
            if (c[i]!=0 &&c[i] %2 ==0){
                n+=c[i];
            }

        }
        //加上最大单值
        n+=max;
        return n;
    }



}
