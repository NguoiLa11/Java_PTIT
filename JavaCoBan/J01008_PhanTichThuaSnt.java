package JavaCoBan;

import java.util.Scanner;

public class J01008_PhanTichThuaSnt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int d = 1;
        while (t > 0) {
            int n = sc.nextInt();
            System.out.printf("Test " + d + ": ");
            for (int i = 2; i <= n; i++) {
                int cnt = 0;
                while (n % i == 0) {
                    cnt++;
                    n /= i;
                }
                if (cnt != 0) {
                    System.out.printf(i + "(" + cnt + ")" + " ");
                }
            }
            System.out.println();
            d++;
            t--;
        }
    }
}
