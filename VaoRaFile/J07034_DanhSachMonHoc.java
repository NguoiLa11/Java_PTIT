package VaoRaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class MonHoc {
    private String maMon, tenMon;
    private int soTin;
    public MonHoc() {
        
    }
    public MonHoc(String maMon, String tenMon, int soTin) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.soTin = soTin;
    }
    public String getTenMon() {
        return this.tenMon;
    }
    @Override
    public String toString() {
        return this.maMon+" "+this.tenMon+" "+this.soTin;
    }
}
public class J07034_DanhSachMonHoc {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> arr=new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
            String maMon=sc.nextLine();
            String tenMon=sc.nextLine();
            int soTin=Integer.parseInt(sc.nextLine());
            arr.add(new MonHoc(maMon,tenMon,soTin));
        }
        Collections.sort(arr, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc a, MonHoc b) {
                return a.getTenMon().compareTo(b.getTenMon());
            }
        });
        for(MonHoc x: arr) {
            System.out.println(x);
        }
    }
}
