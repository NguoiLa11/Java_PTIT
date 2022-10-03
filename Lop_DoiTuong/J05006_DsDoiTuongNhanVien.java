package Lop_DoiTuong;

import java.util.Scanner;

class NhanVien {
    private String hoTen, gioiTinh, ngaySinh, diaChi, maSo, ngayKy;
    public NhanVien() {
        
    }
    public NhanVien(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSo, String ngayKy) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSo = maSo;
        this.ngayKy = ngayKy;
    }
    public void nhap(Scanner sc) {
        sc.nextLine();
        hoTen=sc.nextLine();
        gioiTinh=sc.next();
        ngaySinh=sc.next();
        sc.nextLine();
        diaChi=sc.nextLine();
        maSo=sc.next();
        ngayKy=sc.next();
    }
    public void in() {
        System.out.println(hoTen+" "+gioiTinh+" "+ngaySinh+" "+diaChi+" "+maSo+" "+ngayKy);
    }
}
public class J05006_DsDoiTuongNhanVien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            NhanVien a=new NhanVien();
            a.nhap(sc);
            System.out.print("000"+String.format("%02d", i)+" ");
            a.in();
        }
    }
}
