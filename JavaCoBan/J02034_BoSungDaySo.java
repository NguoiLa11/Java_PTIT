package JavaCoBan;

import java.util.Arrays;
import java.util.Scanner;

public class J02034_BoSungDaySo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int  a[]=new int[n];
        int M[]=new int[205];
        Arrays.fill(M, 0);
        int max=0;
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
            M[a[i]]=1;
            if(a[i]>max) max=a[i];
        }
        int cnt=0;
        for(int i=1;i<=max;i++) {
            if(M[i]==0) {
                System.out.println(i);
                cnt++;
            }
        }
        if(cnt==0) System.out.println("Excellent!");
    }
}
