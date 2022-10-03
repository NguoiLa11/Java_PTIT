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
    public String getMaSv() {
        return this.maSv;
    }
    @Override
    public String toString() {
        return this.maSv+" "+this.hoTen+" "+this.lopHoc+" "+this.mail;
    }
}
public class J05021_SapXepTheoMaSinhVien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<SinhVien> arr=new ArrayList<>();
        while(sc.hasNextLine()) {
            String maSv, hoTen, lopHoc, mail;
            maSv=sc.nextLine();
            if(maSv.isEmpty()) {
                break;
            }
            hoTen=sc.nextLine();
            lopHoc=sc.nextLine();
            mail=sc.nextLine();
            arr.add(new SinhVien(maSv,hoTen,lopHoc,mail));
        }
        Collections.sort(arr, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien a, SinhVien b) {
                return a.getMaSv().compareTo(b.getMaSv());
            }
        });
        for(SinhVien x:arr) {
            System.out.println(x);
        }
    }
}
