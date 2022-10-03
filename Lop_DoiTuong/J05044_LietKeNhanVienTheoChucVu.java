package Lop_DoiTuong;

import java.util.ArrayList;
import java.util.Scanner;

class NhanVien {
    private String id, hoten, chucVu;
    private long luong, ngayCong, pc, luongcb, tamUng, conLai;
    public void GiaoVien() {
        
    }
    public NhanVien(int stt, String hoten, String chucVu, long luong, long ngayCong) {
        this.id = "NV"+String.format("%02d", stt);
        this.hoten = hoten;
        this.chucVu = chucVu;
        this.luong = luong;
        this.ngayCong = ngayCong;
        this.luongcb=luong*ngayCong;
        if(this.chucVu.equals("GD")) this.pc=500;
        else if(this.chucVu.equals("PGD")) this.pc=400;
        else if(this.chucVu.equals("TP")) this.pc=300;
        else if(this.chucVu.equals("KT")) this.pc=250;
        else this.pc=100;
        long a=((this.pc+this.luongcb)*2)/3;
        if(a<25000) {
            this.tamUng=Math.round((double) a/1000)*1000;
        } else {
            this.tamUng=25000;
        }
        
        this.conLai=this.luongcb+this.pc-this.tamUng;
    }
    public String getChucVu() {
        return this.chucVu;
    }
    @Override
    public String toString() {
        return this.id+" "+this.hoten+" "+this.pc+" "+this.luongcb+" "+this.tamUng+" "+this.conLai;
    }
}
public class J05044_LietKeNhanVienTheoChucVu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<NhanVien> arr=new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
            String hoTen=sc.nextLine();
            String chucVu=sc.nextLine();
            long luong=Long.parseLong(sc.nextLine());
            long ngayCong=Long.parseLong(sc.nextLine());
            arr.add(new NhanVien(i+1,hoTen,chucVu,luong,ngayCong));
        }
        String cv=sc.nextLine();
        for(NhanVien x:arr) {
            if(x.getChucVu().equals(cv)) {
                System.out.println(x);
            }
        }
    }
}
