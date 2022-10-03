package Lop_DoiTuong;

import java.util.ArrayList;
import java.util.Scanner;

class DonHang {
    private String donHang, maDon, k;
    private long donGia, soLuong, x, giamGia, thanhTien;
    public DonHang() {
        
    }
    public DonHang(String donHang, String maDon, long donGia, long soLuong) {
        this.donHang = donHang;
        this.maDon = maDon;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.k=maDon.substring(1,4);
        this.x=Long.parseLong(maDon.substring(4));
        long a=this.donGia*this.soLuong;
        if(x==1) {
            this.giamGia=a*50/100;
        } else if(x==2) {
            this.giamGia=a*30/100;
        }
        this.thanhTien=a-this.giamGia;
    }
    @Override
    public String toString() {
        return this.donHang+" "+this.maDon+" "+this.k+" "+this.giamGia+" "+this.thanhTien;
    }
}
public class J05052_TraCuuDonHang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<DonHang> arr=new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
            String donHang=sc.nextLine();
            String maDon=sc.nextLine();
            long donGia=Long.parseLong(sc.nextLine());
            long soLuong=Long.parseLong(sc.nextLine());
            arr.add(new DonHang(donHang,maDon,donGia,soLuong));
        }
        for(DonHang x:arr) {
            System.out.println(x);
        }
    }
}
