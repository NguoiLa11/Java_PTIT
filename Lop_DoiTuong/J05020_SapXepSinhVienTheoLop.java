package Lop_DoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SinhVien {
    private String maSv, hoTen, lopHoc, mail;
    public SinhVien() {
        
    }
    public SinhVien(String maSv, String hoTen, String lopHoc, String mail) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.lopHoc = lopHoc;
        this.mail = mail;
    }
    public String getLopHoc() {
        return this.lopHoc;
    }
    public String getMaSv() {
        return this.maSv;
    }
    @Override
    public String toString() {
        return this.maSv+" "+this.hoTen+" "+this.lopHoc+" "+this.mail;
    }
}
public class J05020_SapXepSinhVienTheoLop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<SinhVien> arr=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0) {
            String maSv=sc.nextLine();
            String hoTen=sc.nextLine();
            String lopHoc=sc.nextLine();
            String mail=sc.nextLine();
            arr.add(new SinhVien(maSv,hoTen,lopHoc,mail));
        }
        Collections.sort(arr,new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien a, SinhVien b) {
                if(a.getLopHoc().equals(b.getLopHoc())) {
                    return a.getMaSv().compareTo(b.getMaSv());
                } else{
                    return a.getLopHoc().compareTo(b.getLopHoc());
                }
            }
        });
        for(SinhVien x:arr) {
            System.out.println(x);
        }
    }
}