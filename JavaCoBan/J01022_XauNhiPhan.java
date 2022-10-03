package JavaCoBan;

import java.util.Scanner;

public class J01022_XauNhiPhan {
    public static long f[]=new long[100];
    public static char tinh(int n, long k) {
        if(n==1) return '0';
        if(n==2) return '1';
        if(k<=f[n-2]) return tinh(n-2, k);
        return tinh(n-1, k-f[n-2]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        f[0]=0; f[1]=1;
        for(int i=2;i<=92;i++) {
            f[i]=f[i-1]+f[i-2];
        }
        while(t>0) {
            int n=sc.nextInt();
            long k=sc.nextLong();
            System.out.println(tinh(n,k));
            t--;
        }
    }
}
