package Lop_DoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
    public long getThuNhap() {
        return this.luongcb+this.pc;
    }
    public String getMa() {
        return this.id;
    }
    @Override
    public String toString() {
        return this.id+" "+this.hoten+" "+this.pc+" "+this.luongcb+" "+this.tamUng+" "+this.conLai;
    }
}
public class J05045_SapXepNhanVienTheoThuNhap {
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
        Collections.sort(arr, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien a, NhanVien b) {
                if(a.getThuNhap()==b.getThuNhap()) {
                    return a.getMa().compareTo(b.getMa());
                } else {
                    if(a.getThuNhap()<b.getThuNhap()) return 1;
                    return -1;
                }
            }
        });
        for(NhanVien x:arr) {
            System.out.println(x);
        }
    }
}
