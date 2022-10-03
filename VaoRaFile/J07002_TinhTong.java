package VaoRaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07002_TinhTong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("DATA.in"));
        long res=0;
        while(sc.hasNext()) {
            String s=sc.next();
            try {
                res+=Integer.parseInt(s);
            } catch (Exception e) {
                
            }
        }
        System.out.println(res);
    }
}
