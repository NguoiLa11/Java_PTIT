package JavaCoBan;

import java.util.Scanner;

public class J02022_SoXaCach {
    public static int a[]=new int[15];
    public static boolean b[]=new boolean[15];
    public static void in(int n) {
        for(int i=1;i<=n;i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }
    public static boolean check(int n) {
        for(int i=1;i<n;i++) {
            int t=Math.abs(a[i]-a[i+1]);
            if(t==1) return false; 
        } 
        return true;
    }
    public static void Try(int i, int n) {
        for(int j=1;j<=n;j++) {
            if(b[j]==false){
                a[i]=j; b[j]=true;
                if(i==n) {
                    if(check(n)) in(n);
                }
                else Try(i+1, n);
                b[j]=false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0) {
            int n=sc.nextInt();
            for(int i=1;i<=n;i++) b[i]=false;
            Try(1, n);
            t--;
        }
    }
}
