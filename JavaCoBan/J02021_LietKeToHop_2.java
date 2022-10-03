package JavaCoBan;

import java.util.Scanner;


public class J02021_LietKeToHop_2 {
    public static int a[]=new int[15];
    public static int cnt=0;
    public static void in(int k) {
        for(int i=1;i<=k;i++) {
            System.out.print(a[i]);
        }
        System.out.print(" ");
    }
    public static void Try(int i, int n, int k) {
        for(int j=a[i-1]+1;j<=n-k+i;j++) {
            a[i]=j;
            if(i==k) {
                cnt++;
                in(k);
            }
            else Try(i+1, n, k);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), k=sc.nextInt();
        Try(1, n, k);
        System.out.println();
        System.out.println("Tong cong co "+cnt+" to hop");
    }
}
