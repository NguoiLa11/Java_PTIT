package JavaCoBan;

import java.util.Scanner;

public class J02011_SxChon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        int d=1;
        for(int i=0;i<n-1;i++) {
            int min=a[i];
            for(int j=i+1;j<n;j++) {
                if(a[j]<min) min=a[j];
            }
            for(int j=i+1;j<n;j++) {
                if(a[j]==min) {
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
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
