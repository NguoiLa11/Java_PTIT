package Lop_DoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class DonHang {
    private String tenHang, maDon, k;
    private long donGia, soLuong, x, giamGia, thanhTien;
    public DonHang() {
        
    }
    public DonHang(String tenHang, String maDon,long donGia, long soLuong) {
        this.tenHang = tenHang;
        this.maDon = maDon;
        this.k = k;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.x = x;
        this.giamGia = giamGia;
        this.thanhTien = thanhTien;
        this.k=this.maDon.substring(1,4);
        this.x=Integer.parseInt(maDon.substring(4));
        long a=this.soLuong*this.donGia;
        if(x==1) {
            this.giamGia=a*50/100;
        } else if(x==2) {
            this.giamGia=a*30/100;
        }
        this.thanhTien=a-this.giamGia;
    }
    public String getK() {
        return this.k;
    }
    @Override
    public String toString() {
        return this.tenHang+" "+this.maDon+" "+this.k+" "+this.giamGia+" "+this.thanhTien;
    }
}
public class J05053_SapXepDonHang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<DonHang> arr=new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
            String tenHang=sc.nextLine();
            String maDon=sc.nextLine();
            long donGia=Long.parseLong(sc.nextLine());
            long soLuong=Long.parseLong(sc.nextLine());
            arr.add(new DonHang(tenHang, maDon, donGia, soLuong));
        }
        Collections.sort(arr, new Comparator<DonHang>() {
            @Override
            public int compare(DonHang a, DonHang b) {
                return a.getK().compareTo(b.getK());
            }
        });
        for(DonHang x:arr) {
            System.out.println(x);
        }
    }
}
