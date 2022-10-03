package Lop_DoiTuong;

import java.util.Scanner;

class NhanVien {
    private String hoTen;
    private int luongcb, ngayCong;
    private String chucVu;
    public NhanVien() {
        
    }
    public NhanVien(String hoTen, int luongcb, int ngayCong, String chucVu) {
        this.hoTen = hoTen;
        this.luongcb = luongcb;
        this.ngayCong = ngayCong;
        this.chucVu = chucVu;
    }
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        hoTen=sc.nextLine();
        luongcb=sc.nextInt();
        ngayCong=sc.nextInt();
        chucVu=sc.next();
    }
    public void in() {
        long pc=0;
        long luong=luongcb*ngayCong;
        if(ngayCong>=25) {
            pc=20*luong/100;
        }
        else if(ngayCong>=22 && ngayCong<25) {
            pc=10*luong/100;
        } else {
            pc=0;
        }
        long thuong=0;
        if(chucVu.equals("GD"))  thuong=250000;
        else if(chucVu.equals("PGD"))  thuong=200000;
        else if(chucVu.equals("TP"))  thuong=180000;
        else if(chucVu.equals("NV"))  thuong=150000;
        long ans=thuong+luong+pc;
        System.out.println("NV01 "+" "+hoTen+" "+luong+" "+pc+" "+thuong+" "+ans);
    }
}
public class J04012_BaiToanTinhCong {
    public static void main(String[] args) {
        NhanVien a=new NhanVien();
        a.nhap();
        a.in();
    }
}
