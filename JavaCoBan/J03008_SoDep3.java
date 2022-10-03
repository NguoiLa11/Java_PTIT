package JavaCoBan;

import java.util.Scanner;


public class J03008_SoDep3 {
    
    public static boolean thuannghich(String s) {
        int n=s.length();
        for(int i=0;i<n/2;i++) {
            if(s.charAt(i)!=s.charAt(n-i-1)) return false;
        }
        return true;
    }
    public static boolean check(String s) {
        for(int i=0;i<s.length();i++) {
            int n=s.charAt(i)-'0';
            if(n!=2 && n!=3 && n!=5 && n!=7) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  t=sc.nextInt();
        while(t>0) {
            String s=sc.next();
            if(thuannghich(s)==true && check(s)==true) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}

//3
//123456787654321
//235755557532
//2222333355557777235775327777555533332222