package JavaCoBan;

import java.util.Scanner;

public class J03010_DiaChiEmail {
    public static String chuanHoa(String s) {
        String res="";
        for(int i=0;i<s.length();i++) {
            res+=Character.toLowerCase(s.charAt(i));
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d=0;
        String lst[]=new String[1005];
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0) {
            String s=sc.nextLine().trim();
            String arr[]=s.split("\\s+");
            String res="";
            res+=chuanHoa(arr[arr.length-1]);
            for(int i=0;i<arr.length-1;i++) {
                res+=Character.toLowerCase(arr[i].charAt(0));
            }
            int tt=1;
            lst[d]=res;
            for(int i=0;i<d;i++) {
                if(lst[i].equals(res)) tt++;
            }
            if(tt>1) System.out.print(res+tt+"@ptit.edu.vn");
            else if(tt==1) System.out.print(res+"@ptit.edu.vn");
            System.out.println("");
            d++;
        }
    }
}
//4
//    nGUYEn    quaNG   vInH  
//   tRan   thi THU    huOnG
//   nGO   quoC  VINH
// lE            tuAn    aNH
