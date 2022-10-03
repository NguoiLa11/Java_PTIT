package JavaCoBan;

import java.util.Scanner;

public class J01010_CatDoi {

    public static boolean check(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '8' && s.charAt(i) != '9') {
                return false;
            }
        }
        return true;
    }

    public static boolean check1(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                return true;
            }
        }
        return false;
    }

    public static String catdoi(String s) {
        String temp = "";
        if (!check(s)) {
            temp = "INVALID";
        } else {
            if (!check1(s)) {
                temp = "INVALID";
            } else {
                int index = 0;
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '1') {
                        index = i;
                        break;
                    }
                }
                for (int i = index; i < s.length(); i++) {
                    if (s.charAt(i) == '0' || s.charAt(i) == '8' || s.charAt(i) == '9') {
                        temp += "0";
                    } else if (s.charAt(i) == '1') {
                        temp += "1";
                    }
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(catdoi(s));
        }
    }
}
//3
//1890
//3681
//8919
