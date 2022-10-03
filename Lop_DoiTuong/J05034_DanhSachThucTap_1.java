package Lop_DoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class ThucTap {
    private int id;
    private String maSv, hoTen, lopHoc, mail, doanhNghiep;
    public ThucTap() {
        
    }
    public ThucTap(int id, String maSv, String hoTen, String lopHoc, String mail, String doanhNghiep) {
        this.id = id;
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.lopHoc = lopHoc;
        this.mail = mail;
        this.doanhNghiep = doanhNghiep;
    }
    public String getHoTen() {
        return this.hoTen;
    }
    public String getDoanhNghiep() {
        return this.doanhNghiep;
    }
    @Override
    public String toString() {
        return this.id+" "+this.maSv+" "+this.hoTen+" "+this.lopHoc+" "+this.mail+" "+this.doanhNghiep;
    }
}
public class J05034_DanhSachThucTap_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<ThucTap> arr=new ArrayList<>();
        int n=sc.nextInt();
            sc.nextLine();
        for(int i=0;i<n;i++){
            String maSv=sc.nextLine();
            String hoTen=sc.nextLine();
            String lopHoc=sc.nextLine();
            String mail=sc.nextLine();
            String doanhNghiep=sc.nextLine();
            arr.add(new ThucTap(i+1,maSv,hoTen,lopHoc,mail,doanhNghiep));
        }
        Collections.sort(arr,new Comparator<ThucTap>() {
            @Override
            public int compare(ThucTap a, ThucTap b) {
                return a.getHoTen().compareTo(b.getHoTen());
            }
        });
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0) {
            String dn=sc.nextLine();
            for(ThucTap x:arr) {
                if(x.getDoanhNghiep().equals(dn)) {
                    System.out.println(x);
                }
            }
        }
    }
}
