package JavaCoBan;

import java.util.Scanner;

public class J02010_SxDoiChoTrucTiep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int d=1;
        for(int i=0;i<n-1;i++) {
            for(int j=i+1;j<n;j++) {
                if(a[i]>a[j]) {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.print("Buoc "+d+": ");
            for(int j=0;j<n;j++) {
                System.out.print(a[j]+" ");
            }
            d++;
            System.out.println();
        }
    }
}
