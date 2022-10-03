
import java.util.Scanner;
public class J01007_KtraSoFibo {
    public static boolean check(long n) {
        long a=0, b=1;
        if(n==0 || n==1) return true;
        long c=a+b;
        while(c<=n) {
            c=a+b;
            if(c==n) return true;
            a=b;
            b=c;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0) {
            long n=sc.nextLong();
            if(check(n)==true) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
