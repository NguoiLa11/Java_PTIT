package JavaCoBan;

import java.util.Scanner;

public class J03005_ChuanHoaHoTen_2 {
    public static String vietHoa(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            res += Character.toUpperCase(s.charAt(i));
        }
        return res;
    }
    public static String chuanHoa(String s) {
        String res = "";
        res += Character.toUpperCase(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            res += Character.toLowerCase(s.charAt(i));
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine().trim();
            String arr[] = s.split("\\s+");
            for (int i = 1; i < arr.length; i++) {
                if (i != arr.length - 1) {
                    System.out.print(chuanHoa(arr[i]) + " ");
                } else {
                    System.out.print(chuanHoa(arr[i]) + ", ");
                }
            }
            System.out.print(vietHoa(arr[0]));
            System.out.println("");
        }
    }
}
