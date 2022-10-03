package JavaCoBan;

import java.util.Scanner;

public class J03024_SoUuThe {
    public static boolean check1(String s) {
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)<'0' || s.charAt(i)>'9') return true;
        }
        return false;
    }
    public static boolean check2(String s) {
        int d1=0, d2=0;
        int n=s.length();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)%2==0)d1++;
            else d2++;
        }
        if((n%2==0 && d1>d2) || (n%2!=0 && d1<d2)) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0) {
            String s=sc.next();
            if(check1(s)) System.out.println("INVALID");
            else if(check2(s)==true) System.out.println("YES");
            else if(check2(s)==false) System.out.println("NO");
            t--;
        }
    }
}
