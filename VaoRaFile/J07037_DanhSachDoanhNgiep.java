package VaoRaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class DoanhNghiep {
    private String maDn, tenDn;
    private int soLuong;
    public DoanhNghiep() {
        
    }
    public DoanhNghiep(String maDn, String tenDn, int soLuong) {
        this.maDn = maDn;
        this.tenDn = tenDn;
        this.soLuong = soLuong;
    }
    public String getMaDn() {
        return this.maDn;
    }
    @Override
    public String toString() {
        return this.maDn+" "+this.tenDn+" "+this.soLuong;
    }
}
public class J07037_DanhSachDoanhNgiep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("DN.in"));
        ArrayList<DoanhNghiep> arr=new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
            String maDn=sc.nextLine();
            String tenDn=sc.nextLine();
            int soLuong=Integer.parseInt(sc.nextLine());
            arr.add(new DoanhNghiep(maDn,tenDn,soLuong));
        }
        Collections.sort(arr, new Comparator<DoanhNghiep>() {
            @Override
            public int compare(DoanhNghiep a, DoanhNghiep b) {
                return a.getMaDn().compareTo(b.getMaDn());
            }
        });
        for(DoanhNghiep x:arr) {
            System.out.println(x);
        }
    }
}
