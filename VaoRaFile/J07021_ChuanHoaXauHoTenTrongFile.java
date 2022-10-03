package VaoRaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class J07021_ChuanHoaXauHoTenTrongFile {
    public static String chuanHoa(String s) {
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
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()) {
            String s=sc.nextLine().trim();
            if(s.equals("END")) {
                break;
            }
            System.out.println(chuanHoa(s));
        }
    }
}
