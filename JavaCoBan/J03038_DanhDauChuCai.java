package JavaCoBan;

import java.util.Scanner;

public class J03038_DanhDauChuCai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int m[]=new int[256];
        for(int i=0;i<s.length();i++) {
            m[s.charAt(i)]++;
        }
        int cnt=0;
        for(int i=0;i<256;i++) {
            if(m[i]!=0) {
                cnt++;
                m[i]=0;
            }
        }
        System.out.println(cnt);
    }
}
