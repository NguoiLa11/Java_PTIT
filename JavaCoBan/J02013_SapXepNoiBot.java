package JavaCoBan;

import java.util.Scanner;


public class J02013_SapXepNoiBot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        int d=1;
        for(int i=0;i<n;i++) {
            boolean ok=false;
            for(int j=0;j<n-i-1;j++) {
                if(a[j]>a[j+1]) {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    ok=true;
                }
            }
            if(!ok) break;
            else {
                System.out.print("Buoc "+d+": ");
                for(int j=0;j<n;j++) {
                    System.out.print(a[j]+" ");
                }
            }
            d++;
            System.out.println("");
        }
    }
}
