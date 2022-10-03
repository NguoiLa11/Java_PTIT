package Lop_DoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class ThucTap {
    private  String maDn, tenDn;
    private int soLuong;
    public ThucTap() {
        
    }
    public ThucTap(String maDn, String tenDn, int soLuong) {
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
public class J05029_DsDoanhNghiepThucTap_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<ThucTap> arr=new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
            String maDn=sc.nextLine();
            String tenDn=sc.nextLine();
            int soLuong=Integer.parseInt(sc.nextLine());
            arr.add(new ThucTap(maDn, tenDn, soLuong));
        }
        Collections.sort(arr, new Comparator<ThucTap>() {
            @Override
            public int compare(ThucTap a, ThucTap b) {
                if(a.getSoLuong()==b.getSoLuong()) {
                    return a.getMaDn().compareTo(b.getMaDn());
                } else {
                    return b.getSoLuong()-a.getSoLuong();
                }
            }
        });
        int t=sc.nextInt();
        while(t-->0) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+a+" DEN "+b+" SINH VIEN:");
            for(ThucTap x:arr) {
                if(x.getSoLuong()>=a && x.getSoLuong()<=b) {
                    System.out.println(x);
                }
            }
        }
    }
}
