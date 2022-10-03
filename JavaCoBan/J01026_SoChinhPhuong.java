package JavaCoBan;

import java.util.Scanner;
public class J01026_SoChinhPhuong {
    public static boolean check(int n) {
        int x=(int) Math.sqrt(n);
        if(x*x==n) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0) {
            int n=sc.nextInt();
            if(check(n)==true) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
