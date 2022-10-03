package Lop_DoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SinhVien {
    private String maDn, tenDn;
    private int soLuong;
    public SinhVien() {
        
    }
    public SinhVien(String maDn, String tenDn, int soLuong) {
        this.maDn = maDn;
        this.tenDn = tenDn;
        this.soLuong = soLuong;
    }
    public int getSoLuong() {
        return this.soLuong;
    }
    public String getMaDn() {
        return this.maDn;
    }
    @Override
    public String toString() {
        return this.maDn+" "+this.tenDn+" "+this.soLuong;
    }
}
public class J05028_DsDoanhNghiepThucTap_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<SinhVien> arr=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            sc.nextLine();
            String maDn=sc.nextLine();
            String tenDn=sc.nextLine();
            int soLuong=sc.nextInt();
            arr.add(new SinhVien(maDn,tenDn,soLuong));
        }
        Collections.sort(arr, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien a, SinhVien b) {
                if( a.getSoLuong()!=b.getSoLuong()) {
                    if(a.getSoLuong()<b.getSoLuong()) return 1;
                    else return -1;
                } else {
                    return a.getMaDn().compareTo(b.getMaDn());
                }
            }
        });
        for(SinhVien x:arr) {
            System.out.println(x);
        }
    }
}
