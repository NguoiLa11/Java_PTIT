package Lop_DoiTuong;

import java.util.Scanner;

class NhanVien {
    private String hoTen, gioiTinh, ngaySinh, diaChi, maThue, ngayKyhd;
    public NhanVien() {
    }

    public NhanVien(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maThue, String ngayKyhd) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maThue = maThue;
        this.ngayKyhd = ngayKyhd;
    }
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        hoTen=sc.nextLine();
        gioiTinh=sc.nextLine();
        ngaySinh=sc.nextLine();
        diaChi=sc.nextLine();
        maThue=sc.nextLine();
        ngayKyhd=sc.nextLine();
    }
    public void in() {
        System.out.println("00001 "+hoTen+" "+gioiTinh+" "+ngaySinh+" "+
                diaChi+" "+maThue+" "+ngayKyhd);
    }
}
public class J04007_KhaiBaoLopNhanVien {
    public static void main(String[] args) {
        NhanVien a=new NhanVien();
        a.nhap();
        a.in();
    }
}
