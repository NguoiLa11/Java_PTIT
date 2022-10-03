package JavaCoBan;

import java.util.Scanner;

public class J01001_Hcn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a <= 0 || b <= 0) {
            System.out.println("0");
        } else {
            long x = (long) (a + b) * 2;
            long y = (long) a * b;
            System.out.println(x + " " + y);
        }
    }
}
