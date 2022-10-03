package Lop_DoiTuong;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class MonThi {
    private String maMon, tenMon, hinhThuc;
    public MonThi() {
        
    }
    public MonThi(String maMon, String tenMon, String hinhThuc) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.hinhThuc = hinhThuc;
    }
    public String getMaMon() {
        return this.maMon;
    }
    @Override
    public String toString() {
        return this.maMon+" "+this.tenMon+" "+this.hinhThuc;
    }
}
public class J07058_DanhSachMonThi {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("MONHOC.in"));
        int n=sc.nextInt();
        sc.nextLine();
        ArrayList<MonThi> arr=new ArrayList<>();
        for(int i=0;i<n;i++) {
            String maMon=sc.nextLine();
            String tenMon=sc.nextLine();
            String hinhThuc=sc.nextLine();
            arr.add(new MonThi(maMon,tenMon,hinhThuc));
        }
        Collections.sort(arr, new Comparator<MonThi>() {
            @Override
            public int compare(MonThi a, MonThi b) {
                return a.getMaMon().compareTo(b.getMaMon());
            }
        });
        for(MonThi x:arr) {
            System.out.println(x);
        }
    }
}
