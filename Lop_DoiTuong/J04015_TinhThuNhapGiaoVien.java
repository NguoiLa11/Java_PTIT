package Lop_DoiTuong;

import java.util.Scanner;

class GiaoVien {
    private String maSo, hoTen;
    private int luongcb;
    public GiaoVien() {
        
    }
    public GiaoVien(String maSo, String hoTen, int luongcb) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.luongcb = luongcb;
    }
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        maSo=sc.nextLine();
        hoTen=sc.nextLine();
        luongcb=sc.nextInt();
    }
    public void in() {
        int k=0, pc=0;
        for(int i=0;i<maSo.length();i++) {
            k=(maSo.charAt(2)-'0')*10+(maSo.charAt(3)-'0');
            if(maSo.charAt(0)=='H' && maSo.charAt(1)=='T') pc=2000000;
            if(maSo.charAt(0)=='H' && maSo.charAt(1)=='P') pc=900000;
            if(maSo.charAt(0)=='G' && maSo.charAt(1)=='V') pc=500000;
        }
        int luong=luongcb*k+pc;
        System.out.println(maSo+" "+hoTen+" "+k+" "+pc+" "+luong);
    }
}
public class J04015_TinhThuNhapGiaoVien {
    public static void main(String[] args) {
        GiaoVien a=new GiaoVien();
        a.nhap();
        a.in();
    }
}
