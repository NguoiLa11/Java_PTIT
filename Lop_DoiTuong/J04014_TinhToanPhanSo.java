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
    public void nhap(Scanner sc) {
        tu=sc.nextLong();
        mau=sc.nextLong();
    }
    public long gcd(long a, long b) {
        if(b==0) return a;
        else return gcd(b, a%b);
    }
    public PhanSo rutgon1(PhanSo p) {
        PhanSo c=new PhanSo();
        c.tu=tu*p.mau+mau*p.tu;
        c.mau=mau*p.mau;
        long gcd1=gcd(c.tu, c.mau);
        c.tu/=gcd1;
        c.mau/=gcd1;
        c.tu=c.tu*c.tu;
        c.mau=c.mau*c.mau;
        return c;
    } 
    public PhanSo rutgon2(PhanSo p, PhanSo c) {
        PhanSo d=new PhanSo();
        d.tu=p.tu*c.tu*tu;
        d.mau=p.mau*mau*c.mau;
        long gcd2=gcd(d.tu, d.mau);
        d.tu/=gcd2;
        d.mau/=gcd2;
        return d;
    }
    public void in() {
        System.out.print(tu+"/"+mau+" ");
    }
}
public class J04014_TinhToanPhanSo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            PhanSo a=new PhanSo();
            PhanSo b=new PhanSo();
            a.nhap(sc);
            b.nhap(sc);
            PhanSo val1 =a.rutgon1(b);
            PhanSo val2 =a.rutgon2(b,val1);
            val1.in();
            val2.in();
            System.out.println("");
        }
    }
}
