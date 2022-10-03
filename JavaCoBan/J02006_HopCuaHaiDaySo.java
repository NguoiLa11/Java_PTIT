package JavaCoBan;

import java.util.Arrays;
import java.util.Scanner;


public class J02006_HopCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), m=sc.nextInt();
        int a[]=new int[n], b[]=new int[m];
        int N[]=new int[1001], M[]=new int[1001];
        Arrays.fill(N, 0);
        Arrays.fill(M, 0);
        for(int i=0;i<1001;i++) {
            N[i]=0; M[i]=0;
        }
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
            N[a[i]]=1;
        }
        for(int i=0;i<m;i++) {
            b[i]=sc.nextInt();
            M[b[i]]=1;
        }
        for(int i=0;i<1001;i++) {
            if(N[i]==1 || M[i]==1) System.out.print(i+" ");
        }
    }
}
