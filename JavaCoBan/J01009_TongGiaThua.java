package JavaCoBan;

import java.util.Scanner;
public class J01009_TongGiaThua {
    public static long solve(int n) {
        long gt=1;
        for(int i=1;i<=n;i++) { 
            gt*=i;
        }
        return gt;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long sum=0;
        for(int i=1;i<=n;i++) {
            sum=sum+solve(i);
        }
        System.out.println(sum);
    }
}
