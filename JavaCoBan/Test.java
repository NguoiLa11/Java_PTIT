package JavaCoBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("DATA.in"));
        String res="";
        while(sc.hasNext()) {
            String s=sc.next();
            try {
                res+=sc.next();
            } catch(NumberFormatException ex) {
                
            }
        }
        System.out.println(res);
    }
}
