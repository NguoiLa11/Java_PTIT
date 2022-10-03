package Lop_DoiTuong;

import java.util.ArrayList;
import java.util.Scanner;

class SinhVien {
    private String maSv, hoTen, lopHoc, mail, temp, ans;
    public SinhVien() {
        
    }
    public SinhVien(String maSv, String hoTen, String lopHoc, String mail) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.lopHoc = lopHoc;
        this.mail = mail;
        this.temp=this.maSv.substring(5,7);
        if(this.lopHoc.charAt(0)!='E' && this.temp.equals("CN")) {
            this.ans="CONG NGHE THONG TIN";
        }
        else if(this.lopHoc.charAt(0)!='E' && this.temp.equals("AT")) {
            this.ans="AN TOAN THONG TIN";
        }
        else if(this.temp.equals("KT")) {
            this.ans="KE TOAN";
        }
        else if(this.temp.equals("VT")) {
            this.ans="VIEN THONG";
        }
        else if(this.temp.equals("DT")) {
            this.ans="DIEN TU";
        }
        else this.ans="";
    }
    public String getAns() {
        return this.ans;
    }
    @Override
    public String toString() {
        return this.maSv+" "+this.hoTen+" "+this.lopHoc+" "+this.mail;
    }
}
public class J05024_LKSinhVienTheoNghanh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<SinhVien> arr=new ArrayList<>();
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++) {
            String maSV=sc.nextLine();
            String hoTen=sc.nextLine();
            String lopHoc=sc.nextLine();
            String mail=sc.nextLine();
            arr.add(new SinhVien(maSV,hoTen,lopHoc,mail));
        }
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0) {
            String s=sc.nextLine();
            s=s.toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH "+s+":");
            for(SinhVien x:arr) {
                if(x.getAns().equals(s)) {
                    System.out.println(x);
                }
            }
        }
    }
}
