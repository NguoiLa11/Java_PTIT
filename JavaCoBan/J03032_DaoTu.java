package JavaCoBan;

import java.util.Scanner;

public class J03032_DaoTu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0) {
            String s=sc.nextLine();
            String arr[]=s.split("\\s+");
            String res="";
            for(int i=0;i<arr.length;i++) {
                res+=new StringBuilder(arr[i]).reverse().toString()+" ";
            }
            System.out.println(res);
        }
    }
}
