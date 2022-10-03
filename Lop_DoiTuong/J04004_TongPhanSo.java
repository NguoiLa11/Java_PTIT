package Lop_DoiTuong;

import java.util.Scanner;

class PhanSo {
    private long tu, mau;
    public PhanSo() {
        
    }
    public PhanSo(int tu, int mau) {
        this.tu=tu;
        this.mau=mau;
    } 
    public void nhap(Scanner sc) {
        tu=sc.nextLong();
        mau=sc.nextLong();
    }
    public long gcd(long a, long b) {
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    public PhanSo rutgon(PhanSo p) {
        PhanSo t=new PhanSo();
        t.tu=tu*p.mau+mau*p.tu;
        t.mau=mau*p.mau;
        long gcd1=gcd(t.tu,t.mau);
        t.tu/=gcd1;
        t.mau/=gcd1;
        return t;
    }
    public void in() {
        System.out.println(tu+"/"+mau);
    }
}
public class J04004_TongPhanSo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PhanSo a=new PhanSo();
        PhanSo b=new PhanSo();
        a.nhap(sc);
        b.nhap(sc);
        PhanSo t=a.rutgon(b);
        t.in();
    }

}
