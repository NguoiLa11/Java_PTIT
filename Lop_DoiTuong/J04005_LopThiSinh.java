package Lop_DoiTuong;

import java.util.PropertyResourceBundle;
import java.util.Scanner;

class Student {
    private String hoTen;
    private String ngaySinh;
    private double d1,d2,d3;
    
    public Student() {
        
    }
    public Student(String hoTen, String ngaySinh, double d1, double d2, double d3) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        hoTen=sc.nextLine();
        ngaySinh=sc.next();
        d1=sc.nextDouble(); d2=sc.nextDouble(); d3=sc.nextDouble();
    }
    public void in() {
        System.out.println(hoTen+" "+ngaySinh+" "+String.format("%.1f", d1+d2+d3));
    }
}

public class J04005_LopThiSinh {
    public static void main(String[] args) {
        Student a=new Student();
        a.nhap();
        a.in();
    }
}
