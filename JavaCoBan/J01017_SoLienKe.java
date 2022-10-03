package JavaCoBan;

import java.util.Scanner;

public class J01017_SoLienKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0) { 
            String s=sc.next();
            int check=1;
            for(int i=0;i<s.length()-1;i++) {
                if((Math.abs(s.charAt(i)-s.charAt(i+1)))!=1) {
                    check=0;
                }
            }
            if(check==1) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
