package JavaCoBan;

import java.util.Scanner;

public class J01014_UocSoNtLonNhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long n = sc.nextLong();
            int max = 0;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    while (n % i == 0) {
                        n /= i;
                        max = i;
                    }
                }
            }
            if (n != 1) {
                System.out.println(n);
            } else {
                System.out.println(max);
            }
            t--;
        }
    }
}
