package JavaCoBan;

import java.util.Scanner;


public class J03006_SoDep1 {
    public static boolean check1(String s) {
        int n=s.length();
        for(int i=0;i<n/2;i++) {
            if(s.charAt(i)!=s.charAt(n-i-1)) return false;
        }
        return true;
    }
    public static boolean check2(String s) {
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)%2!=0) return false;
        }
        return true;
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0) {
            String s=sc.next();
            if(check1(s)==true && check2(s)==true) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
