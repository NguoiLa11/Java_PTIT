package Lop_DoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class TienLuong {
    private String id, hoTen;
    private int luong, ngayCong;
    private String chucVu;
    private int k, luongcb, pc, ans;
    public TienLuong() {
        
    }
    public TienLuong(int stt, String hoTen, int luong, int ngayCong, String chucVu) {
        this.id="NV"+String.format("%02d", stt);
        this.hoTen = hoTen;
        this.luong = luong;
        this.ngayCong = ngayCong;
        this.chucVu = chucVu;
        this.luongcb=this.luong*this.ngayCong;
        if(this.ngayCong>=25) {
            this.k=this.luongcb*20/100;
        } 
        if(this.ngayCong>=22 && this.ngayCong<25) {
            this.k=this.luongcb*10/100;
        }
        if(this.ngayCong<22) {
            this.k=0;
        }
        if(this.chucVu.equals("GD")) this.pc=250000;
        if(this.chucVu.equals("PGD")) this.pc=200000;
        if(this.chucVu.equals("TP")) this.pc=180000;
        if(this.chucVu.equals("NV")) this.pc=150000;
        this.ans=this.luongcb+this.k+this.pc;
    }
    public int getAns() {
        return this.ans;
    }
    @Override
    public String toString() {
        return this.id+" "+this.hoTen+" "+this.luongcb+" "+this.k+" "+this.pc+" "+this.ans;
    }
}
public class J05041_SapXepBangTinhCong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<TienLuong> arr=new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
            String hoTen = sc.nextLine();
            int luong=Integer.parseInt(sc.nextLine());
            int ngayCong=Integer.parseInt(sc.nextLine());
            String chucVu = sc.nextLine();
            arr.add(new TienLuong(i+1,hoTen,luong,ngayCong,chucVu));
        }
        Collections.sort(arr, new Comparator<TienLuong>() {
            @Override
            public int compare(TienLuong a, TienLuong b) {
                return b.getAns()-a.getAns();
            }
        });
        for(TienLuong x:arr) {
            System.out.println(x);
        }
    }
}
