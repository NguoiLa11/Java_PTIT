package JavaCoBan;

import java.util.Scanner;

public class J03004_ChuanHoaXauHoTen_1 {
    public static String chuanhoa(String s) {
        String a[]=s.split("\\s+");
        String res="";
        for(int i=0;i<a.length;i++) {
            res+=Character.toUpperCase(a[i].charAt(0));
            for(int j=1;j<a[i].length();j++) {
                res+=Character.toLowerCase(a[i].charAt(j));
            }
            res+=" ";
        }
        return res;
//        String a[]=s.split("\\s+");
//        StringBuilder sb=new StringBuilder("");
//        for(int i=0;i<a.length;i++) {
//            sb.append(Character.toUpperCase(a[i].charAt(0)));
//            for(int j=1;j<a[i].length();j++) {
//                sb.append(Character.toLowerCase(a[i].charAt(j)));
//            }
//            sb.append(" ");
//        }
//        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0) {
            String s=sc.nextLine().trim();
            System.out.println(chuanhoa(s));
            t--;
        }
    }
}
