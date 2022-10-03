package JavaCoBan;

import java.util.Scanner;


public class J02008_BoiSoCuaNSoNgDuong {
    public static long gcd(long a, long b) {
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0) {
            int n=sc.nextInt();
            long temp=n;
            while(n>=2) {
                temp=temp*n/gcd(temp,n);
                n--;
            }
            System.out.println(temp);
            t--;
        }
    }
}
