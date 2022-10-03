package JavaCoBan;

import java.util.Scanner;


public class J02106_MaTranNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int d=0, d1, d2;
        for (int i = 0; i < n; i++) {
            d1=0; d2=0;
            for(int j=0;j<3;j++) {
                if(a[i][j]==1) d1++;
                else if(a[i][j]==0) d2++;
            }
            if(d1>d2) d++;
        }
        System.out.println(d);
    }
}
