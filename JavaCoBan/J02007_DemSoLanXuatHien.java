package JavaCoBan;

import java.util.Arrays;
import java.util.Scanner;

public class J02007_DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int d=1;
        while(t>0) {
            int n=sc.nextInt();
            int a[]=new int[n];
            int m[]=new int[100005];
            Arrays.fill(m,0);
            for(int i=0;i<n;i++) {
                a[i]=sc.nextInt();
                m[a[i]]++;
            }
            System.out.println("Test "+d+":");
            for(int i=0;i<n;i++) {
                if(m[a[i]]>0) {
                    System.out.println(a[i]+" xuat hien "+m[a[i]]+" lan");
                    m[a[i]]=0;
                }
            }
            d++;
            t--;
        }
    }
}
