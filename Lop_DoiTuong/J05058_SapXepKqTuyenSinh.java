package Lop_DoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class TuyenSinh {
    private String ma, hoTen, ans;
    private float d1,d2,d3,k,tongDiem,uuTien,diemXetTuyen;
    public TuyenSinh() {
        
    }
    public TuyenSinh(String ma, String hoTen, float d1, float d2, float d3) {
        this.ma=ma;
        this.hoTen=hoTen;
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
        this.k=this.ma.charAt(2)-'0';
        this.tongDiem=this.d1*2+this.d2+this.d3;
        if(this.k==1) {
            this.uuTien=(float) 0.5;
        }
        else if(this.k==2) {
            this.uuTien=1;
        }
        else if(this.k==3) {
            this.uuTien=(float) 2.5; 
        }
        this.diemXetTuyen=this.tongDiem+this.uuTien;
        if(this.diemXetTuyen>=24) {
            this.ans="TRUNG TUYEN";
        } else {
            this.ans="TRUOT";
        }
    }
    public float getDiemXetTuyen() {
        return this.diemXetTuyen;
    }
    public String getMa() {
        return this.ma;
    }
    @Override
    public String toString() {
        String diemUuTien=this.uuTien+"";
        if(this.uuTien==(int) this.uuTien) {
            diemUuTien=String.format("%.0f",this.uuTien);
        }
        String diemXT=this.diemXetTuyen+"";
        if(this.diemXetTuyen==(int) this.diemXetTuyen) {
            diemXT=String.format("%.0f",this.diemXetTuyen);
        } else {
            diemXT=String.format("%.1f",this.diemXetTuyen);
        }
        return this.ma+" "+this.hoTen+" "+diemUuTien+" "+diemXT+" "+this.ans;
    }
}
public class J05058_SapXepKqTuyenSinh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<TuyenSinh> arr=new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
            String ma=sc.nextLine();
            String hoTen=sc.nextLine();
            float d1=Float.parseFloat(sc.nextLine());
            float d2=Float.parseFloat(sc.nextLine());
            float d3=Float.parseFloat(sc.nextLine());
            arr.add(new TuyenSinh(ma, hoTen, d1, d2, d3));
        }
        Collections.sort(arr, new Comparator<TuyenSinh>() {
            @Override
            public int compare(TuyenSinh a, TuyenSinh b) {
                if(a.getDiemXetTuyen()<b.getDiemXetTuyen()) return 1;
                else if(b.getDiemXetTuyen()<a.getDiemXetTuyen()) {
                    return -1;
                } else {
                    return a.getMa().compareTo(b.getMa());
                }
            }
        });
        for(TuyenSinh x:arr) {
            System.out.println(x);
        }
    }
}
