package JavaCoBan;

import java.util.Scanner;

public class J02012_SxChen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        int d=0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<=i;j++) {
                if(a[j]>a[i]) {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.print("Buoc "+d+": ");
            for(int j=0;j<=i;j++) {
                System.out.print(a[j]+" ");
            }
            d++;
            System.out.println();
        }
    }
}
