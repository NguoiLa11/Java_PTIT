package Lop_DoiTuong;

import java.util.Scanner;

class TuyenSinh {
    private String ma, hoTen;
    private float d1,d2,d3;
    public TuyenSinh() {
        
    }
    public TuyenSinh(String ma, String hoTen, float d1, float d2, float d3) {
        this.ma=ma;
        this.hoTen=hoTen;
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
    }
    public void nhap(Scanner sc) {
        ma=sc.next();
        sc.nextLine();
        hoTen=sc.nextLine();
        d1=sc.nextFloat();
        d2=sc.nextFloat();
        d3=sc.nextFloat();
    }
    public void in() {
        int k=ma.charAt(2)-'0';
        float d=d1*2+d2+d3;
        System.out.print(ma+" "+hoTen+" ");
        double x=0;
        if(k==1) {
            x=0.5;
            System.out.print("0.5 ");
        }
        else if(k==2) {
            x=1;
            System.out.print("1 ");
        }
        else if(k==3) {
            x=2.5;
            System.out.print("2.5 ");
        }
        if(d%1==0) {
            System.out.print(String.format("%.0f", d)+" ");
        }
        else System.out.print(String.format("%.1f", d)+" ");
        if(d+x<24) {
            System.out.println("TRUOT");
        } else {
            System.out.println("TRUNG TUYEN");
        }
    }
}
public class J05057_BangDiemTuyenSinh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            TuyenSinh a=new TuyenSinh();
            a.nhap(sc);
            a.in();
        }
    }
}
//2
//KV2A002
//Hoang Thanh Tuan
//5
//6
//5
//KV2B123
//Ly Thi Thu Ha
//8
//6.5
//7