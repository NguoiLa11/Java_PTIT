package JavaCoBan;

import java.util.Scanner;

public class J03007_SoDep2 {
    public static boolean thuannghich(String s) {
        int n=s.length();
        for(int i=0;i<n/2;i++) {
            if(s.charAt(i)!=s.charAt(n-i-1)) return false;
        }
        return true;
    }
    public static boolean check1(String s) {
        int n=s.length();
        if(s.charAt(0)!='8' || s.charAt(n-1)!='8') return false;
        else return true;
    }
    public static boolean check2(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++) {
            sum+=s.charAt(i)-'0';
        }
        if(sum%10!=0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  t=sc.nextInt();
        while(t>0) {
            String s=sc.next();
            if(thuannghich(s)==true && check1(s)==true && check2(s)==true) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
//4
//123456787654321
//8644281154664511824468
//8006000444400000000000044440006008
//82123400000000000000000000000432128