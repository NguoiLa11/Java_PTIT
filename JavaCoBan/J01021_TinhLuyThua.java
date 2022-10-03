package JavaCoBan;

import java.util.Scanner;

public class J01021_TinhLuyThua {
    public static int mod=(int)1e9+7;
    public static long tinh(int a, long b) {
        if(b==0) return 1;
        long x=tinh(a, b/2);
        if(b%2==0) return (x*x)%mod;
        else return ((x*x)%mod*a)%mod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int a = sc.nextInt();
            long b = sc.nextLong();
            if(a==0 && b==0) break; 
            System.out.println(tinh(a, b));
        }
    }
}
