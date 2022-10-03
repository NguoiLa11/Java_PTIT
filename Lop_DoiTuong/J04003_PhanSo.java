package Lop_DoiTuong;

import java.util.Scanner;
class PhanSo {
    private long tu, mau;
    public PhanSo() {
        
    }
    public PhanSo(long tu, long mau) {
        this.tu=tu;
        this.mau=mau;
    }
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        tu=sc.nextLong();
        mau=sc.nextLong();
    }
    public long gcd(long a, long b) {
        if(b==0) return a;
        return gcd(b, a%b);
    }
    public void rutgon() {
        long ucln=gcd(tu,mau);
        tu/=ucln;
        mau/=ucln;
    }
    public void in() {
        System.out.println(tu+"/"+mau);
    }
}
public class J04003_PhanSo {
    public static void main(String[] args) {
        PhanSo a=new PhanSo();
        a.nhap();
        a.rutgon();
        a.in();
    }
}
