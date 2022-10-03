package Lop_DoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class TienLuong {
    private String hoTen;
    private int luong, ngayCong;
    private String chucVu;
    public TienLuong() {
        
    }
    public TienLuong(String hoTen, int luong, int ngayCong, String chucVu) {
        this.hoTen = hoTen;
        this.luong = luong;
        this.ngayCong = ngayCong;
        this.chucVu = chucVu;
    }
    public void nhap(Scanner sc){
        sc.nextLine();
        hoTen=sc.nextLine();
        luong=sc.nextInt();
        ngayCong=sc.nextInt();
        chucVu=sc.next();
    }
    public void in() {
        int luongcb=0, k=0;
        luongcb=luong*ngayCong;
        if(ngayCong>=25) {
            k=luongcb*20/100;
        } 
        if(ngayCong>=22 && ngayCong<25) {
            k=luongcb*10/100;
        }
        if(ngayCong<22) {
            k=0;
        }
        int pc=0;
        if(chucVu.equals("GD")) pc=250000;
        if(chucVu.equals("PGD")) pc=200000;
        if(chucVu.equals("TP")) pc=180000;
        if(chucVu.equals("NV")) pc=150000;
        int ans=luongcb+k+pc;
        System.out.println(hoTen+" "+luongcb+" "+k+" "+pc+" "+ans);
    }
}
public class J05040_LapBangTinhCong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            TienLuong a=new TienLuong();
            a.nhap(sc);
            System.out.print("NV"+String.format("%02d", i+1)+" ");
            a.in();
        }
    }
}
