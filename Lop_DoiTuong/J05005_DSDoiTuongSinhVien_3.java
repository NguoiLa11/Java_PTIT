package Lop_DoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SinhVien {
    private String maSv, hoTen, lopHoc, ngaySinh;
    private float gpa;
    public SinhVien() {
        
    }
    public SinhVien(int stt, String hoTen, String lopHoc, String ngaySinh, float gpa) {
        this.maSv="B20DCCN"+String.format("%03d", stt);
        this.hoTen = hoTen;
        this.lopHoc = lopHoc;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }
    public void chuanhoa1() {
        String arr[]=this.ngaySinh.split("/");
        if(arr[0].length()==1) arr[0]=0+arr[0];
        if(arr[1].length()==1) arr[1]=0+arr[1];
        this.ngaySinh=arr[0]+"/"+arr[1]+"/"+arr[2];
    }
    public String chuanhoa2(String hoTen) {
        String a[]=this.hoTen.split("\\s+");
        String res="";
        System.out.print(res);
        for(int i=0;i<a.length;i++) {
            res+=Character.toUpperCase(a[i].charAt(0));
            for(int j=1;j<a[i].length();j++) {
                res+=Character.toLowerCase(a[i].charAt(j));
            }
            res+=" ";
        }
        return res;
    }
    public float getGpa() {
        return this.gpa;
    }
    @Override
    public String toString() {
        chuanhoa1();
        return maSv+" "+chuanhoa2(hoTen)+" "+lopHoc+" "+ngaySinh+" "+String.format("%.2f",gpa);
    }
}
public class J05005_DSDoiTuongSinhVien_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<SinhVien> arr=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            sc.nextLine();
            String hoTen=sc.nextLine().trim();
            String lopHoc=sc.nextLine();
            String ngaySinh=sc.nextLine();
            float gpa=sc.nextFloat();
            arr.add(new SinhVien(i+1, hoTen, lopHoc, ngaySinh, gpa));
        }
        Collections.sort(arr,new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien a, SinhVien b) {
                if(a.getGpa()<b.getGpa()) return 1;
                return -1;
            }
        });
        for(SinhVien x:arr) {
            System.out.println(x);
        }
    }
}
