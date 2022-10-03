package Lop_DoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class MatHang {
    private String maMh, tenMh, donVi;
    private int giaMua, giaBan;
    public MatHang() {
        
    }
    public MatHang(int stt, String tenMh, String donVi, int giaMua, int giaBan) {
        this.maMh = "MH"+String.format("%03d", stt);
        this.tenMh = tenMh;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }
    public int getLoiNhuan() {
        return this.giaBan-this.giaMua;
    }
    public String getMaMh() {
        return this.maMh;
    }
    @Override
    public String toString() {
        return this.maMh+" "+this.tenMh+" "+this.donVi+" "+this.giaMua+" "+this.giaBan+" "+this.getLoiNhuan();
    }
}
public class J05081_DanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<MatHang> arr=new ArrayList<>();
        for(int i=0;i<n;i++) {
            sc.nextLine();
            String tenMh=sc.nextLine();
            String donVi=sc.nextLine();
            int giaMua=sc.nextInt();
            int giaBan=sc.nextInt();
            arr.add(new MatHang(i+1, tenMh, donVi, giaMua, giaBan));
        }
        Collections.sort(arr,new Comparator<MatHang>() {
            @Override
            public int compare(MatHang a, MatHang b) {
                if(a.getLoiNhuan()!=b.getLoiNhuan()) {
                    return b.getLoiNhuan()-a.getLoiNhuan();
                } else {
                    return a.getMaMh().compareTo(b.getMaMh());
                }
            }
        });
        for(MatHang x:arr) {
            System.out.println(x);
        }
    }
}
