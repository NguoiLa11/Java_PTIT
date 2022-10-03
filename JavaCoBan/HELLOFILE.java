package JavaCoBan;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
        
public class HELLOFILE {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile=new File("Hello.txt");
        Scanner sc=new Scanner(myFile);
        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
}
