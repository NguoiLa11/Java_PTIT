package JavaCoBan;

import java.math.BigInteger;
import java.util.Scanner;

public class J03033_BoiSoChungNhoNhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            BigInteger a=sc.nextBigInteger();
            BigInteger b=sc.nextBigInteger();
            BigInteger k=a.gcd(b);
            BigInteger x=(a.multiply(b)).divide(k);
            System.out.println(x);
        }
    }
}
