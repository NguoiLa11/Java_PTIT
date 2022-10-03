package JavaCoBan;

import java.util.Scanner;

public class J02103_TichMaTran {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int d=1;
        while(t-->0) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[][]=new int[n+1][m+1];
            int b[][]=new int[m+1][n+1];
            for(int i=1;i<=n;i++) {
                for(int j=1;j<=m;j++) {
                    b[j][i]=a[i][j]=sc.nextInt();
                }
            }
            System.out.println("Test "+d+":");
            for(int i=1;i<=n;i++) {
                for(int j=1;j<=n;j++) {
                    int x=0;
                    for(int k=1;k<=m;k++) {
                        x+=a[i][k]*b[k][j];
                    }
                    System.out.print(x+" ");
                }
                System.out.println("");
            }
            d++;
        }
    }
}
