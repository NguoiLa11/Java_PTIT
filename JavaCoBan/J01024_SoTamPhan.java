package JavaCoBan;

import java.util.Scanner;
public class J01024_SoTamPhan {
    public static int check(int n) {
        while (n > 0) {
            int tmp = n % 10;
            if (tmp != 0 && tmp != 1 && tmp != 2) return 0;
            n /= 10;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0) {
            int n = sc.nextInt();

            if (check(n) == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
            t--;
        }
    }
}
