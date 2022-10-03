package JavaCoBan;

import java.util.Scanner;

public class J03011_UocSoChungLNCuaSoNgLon {
    public static long du(long a, String b) {
        long ans=0;
        for(int i=0;i<b.length();i++) {
            ans=(ans*10+b.charAt(i)-'0')%a;
        }
        return ans;
    }
    public static long gcd(long a, long b) {
        if(b==0) return a;
        else return gcd(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            long n=sc.nextLong();
            String s=sc.next();
            long x=du(n,s);
            long a=gcd(n, x);
            System.out.println(a);
        } 
    }

}
