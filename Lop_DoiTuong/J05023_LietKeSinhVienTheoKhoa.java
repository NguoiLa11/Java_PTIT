package Lop_DoiTuong;

import java.util.ArrayList;
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
    @Override
    public String toString() {
        return this.maSv+" "+this.hoTen+" "+this.lopHoc+" "+this.mail;
    }
}
public class J05023_LietKeSinhVienTheoKhoa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<SinhVien> arr=new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
            String maSv=sc.nextLine();
            String hoTen=sc.nextLine();
            String lopHoc=sc.nextLine();
            String mail=sc.nextLine();
            arr.add(new SinhVien(maSv,hoTen,lopHoc,mail));
        }
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0) {
            String q=sc.next();
            System.out.println("DANH SACH SINH VIEN KHOA "+q+":");
            for(SinhVien x:arr) {
                if(x.getLopHoc().substring(1,3).equals(q.subSequence(2,4))) {
                    System.out.println(x);
                }
            }
        }
    }
}
