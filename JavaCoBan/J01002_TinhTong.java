package JavaCoBan;

import java.util.Scanner;

public class J01002_TinhTong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0) {
            int n=sc.nextInt();
            long s=(long) n*(n+1)/2;
            System.out.println(s);
            t--;
        }
    }
}
