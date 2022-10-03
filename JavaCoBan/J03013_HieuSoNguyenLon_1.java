package JavaCoBan;

import java.math.BigInteger;
import java.util.Scanner;

public class J03013_HieuSoNguyenLon_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            BigInteger a=sc.nextBigInteger();
            BigInteger b=sc.nextBigInteger();
            BigInteger x=a.subtract(b);
            x = x.abs();
            String s = x.toString();
            String n=a.toString();
            String m=b.toString();
            int maxx=Math.max(n.length(), m.length());
            while (s.length() < maxx) {
                s = "0" + s;
            }
            System.out.println(s);
        }
    }
}
//2
//978
//12977
//100
//1000000
