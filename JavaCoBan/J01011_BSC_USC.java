package JavaCoBan;

import java.util.Scanner;


public class J01011_BSC_USC {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int du = a % b;
            a = b;
            b = du;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int gcd=gcd(a, b);
            long lcm=(long) a*b/gcd;
            System.out.println(lcm+" "+gcd);
            t--;
        }
    }
}
