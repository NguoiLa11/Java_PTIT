package Lop_DoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SinhVien {
    private String maSv, hoTen, lopHoc;
    private float d1,d2,d3;
    public SinhVien() {
        
    }
    public SinhVien(String maSv, String hoTen, String lopHoc, float d1, float d2, float d3) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.lopHoc = lopHoc;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    public String getMaSv() {
        return this.maSv;
    }
    @Override
    public String toString() {
        return this.maSv+" "+this.hoTen+" "+this.lopHoc+" "+String.format("%.01f",d1)+" "+String.format("%.01f",d2)+" "+String.format("%.01f",d3);
    }
}
public class J05030_BangDiemThanhPhan_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<SinhVien> arr=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            sc.nextLine();
            String maSv=sc.nextLine();
            String hoTen=sc.nextLine();
            String lopHoc=sc.nextLine();
            float d1=sc.nextFloat();
            float d2=sc.nextFloat();
            float d3=sc.nextFloat();
            arr.add(new SinhVien(maSv,hoTen,lopHoc,d1,d2,d3));
        }
        Collections.sort(arr, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien a, SinhVien b) {
                return a.getMaSv().compareTo(b.getMaSv());
            }
        });
        int d=1;
        for(SinhVien x:arr) {
            System.out.print(d+" ");
            System.out.println(x);
            d++;
        }
    }
}
