package JavaCoBan;

import java.util.Scanner;

public class J02014_DiemCanBang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0) {
            int n=sc.nextInt();
            int[] a=new int[n];
            int index=-1, sum=0, leftsum=0, rightsum=0;
            for(int i=0;i<n;i++) {
                a[i]=sc.nextInt();
                sum+=a[i];
            }
            for(int i=0;i<n-1;i++) {
                sum-=a[i];
                rightsum=sum;
                if(leftsum==rightsum) {
                    index=i+1;
                    break;
                } else leftsum+=a[i];
            }
            System.out.println(index);
            t--;
        }
    }
}
//2
//7
//-7 1 5 2 -4 3 0
//5
//1 2 3 4 5