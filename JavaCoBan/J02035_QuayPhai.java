package JavaCoBan;

import java.util.Arrays;
import java.util.Scanner;

public class J02035_QuayPhai {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt();
            long a[]=new long[n];
            for(int i=0;i<n;i++) {
                a[i]=sc.nextLong();
            }
            long b[]={0};
            for(int i=0;i<n;i++) {
                b[i]=a[i];
            }
            Arrays.sort(b);
            int cnt=0;
            int i=0,j=0;
            while(i<n) {
                if(a[i]==b[j]) {
                    cnt++;
                    i++;j++;
                } else {
                    i++;
                }
            }
            System.out.println(n-cnt);
        }
    }
}
