package JavaCoBan;

import java.util.Scanner;

public class J03016_ChiaHetCho11 {
    public static boolean check(String s) {
        int s1=0, s2=0;
        for(int i=0;i<s.length();i++) {
            if(i%2==0) {
                s1+=s.charAt(i)-'0';
            } else {
                s2+=s.charAt(i)-'0';
            }
        }
        int x=s1-s2;
        if(x%11==0) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0) {
            String s=sc.next();
            if(check(s)==true) System.out.println("1");
            else System.out.println("0");
            t--;
        }
    }
}
//2
//76945
//363588395960667043875487