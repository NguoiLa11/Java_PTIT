package Lop_DoiTuong;

import java.util.Scanner;

class MatHang {
    private String tenHang, donVi;
    private long giaNhap, soLuong;
    public MatHang() {
        
    }
    public MatHang(String tenHang, String donVi, long giaNhap, long soLuong) {
        this.tenHang = tenHang;
        this.donVi = donVi;
        this.giaNhap = giaNhap;
        this.soLuong = soLuong;
    }
    public void nhap(Scanner sc) {
        sc.nextLine();
        tenHang=sc.nextLine();
        donVi=sc.next();
        giaNhap=sc.nextLong();
        soLuong=sc.nextLong();
    }
    public void in() {
        long phiVc=Math.round((double) giaNhap*soLuong*5/100);
        long thanhTien=Math.round(giaNhap*soLuong+phiVc);
        long giaBan=thanhTien+Math.round((double) thanhTien*2/100);
        System.out.println(tenHang+" "+donVi+" "+phiVc+" "+thanhTien+" "+giaBan);
    }
}
public class J05036_TinhGiaBan_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            MatHang a=new MatHang();
            a.nhap(sc);
            System.out.print("MH"+String.format("%02d",i+1)+" ");
            a.in();
        }
    }
}
