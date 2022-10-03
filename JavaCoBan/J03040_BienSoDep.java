package JavaCoBan;

import java.util.Scanner;

public class J03040_BienSoDep {
    public static boolean check1(String s) {
        int n=s.length();
        for(int i=0;i<n;i++) {
            if(s.charAt(5)<s.charAt(6) && s.charAt(6)<s.charAt(7) && s.charAt(7)<s.charAt(9) && s.charAt(9)<s.charAt(10)) {
                return true;
            }
        }
        return false;
    }
    public static boolean check2(String s) {
        boolean test1=false, test2=false;
        int n=s.length();
        for(int i=0;i<n;i++) {
            if(s.charAt(5)==s.charAt(6) && s.charAt(6)==s.charAt(7)) test1=true;
            if(s.charAt(9)==s.charAt(10)) test2=true;
            if(test1 && test2) return true;
        }
        return false;
    }
    public static boolean check3(String s) {
        int n=s.length();
	for(int i=0;i<n;i++) {
            if(s.charAt(5)!='6' && s.charAt(5)!='8') return false;
            if(s.charAt(6)!='6' && s.charAt(6)!='8') return false;
            if(s.charAt(7)!='6' && s.charAt(7)!='8') return false;
            if(s.charAt(9)!='6' && s.charAt(9)!='8') return false;
            if(s.charAt(10)!='6' && s.charAt(10)!='8') return false;
	}
	return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            String s=sc.next();
            if(check1(s) || check2(s) || check3(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
