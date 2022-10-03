package Lop_DoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class MatHang {
    private int id;
    private String tenMh, nhomMh;
    private float giaMua, giaBan;
    public MatHang() {
        
    }
    public MatHang(int stt, String tenMh, String nhomMh, float giaMua, float giaBan) {
        this.id=stt;
        this.tenMh = tenMh;
        this.nhomMh = nhomMh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }
    public float getLoiNhuan() {
        return this.giaBan-this.giaMua;
    }
    @Override
    public String toString() {
        return this.id+" "+this.tenMh+" "+this.nhomMh+" "+String.format("%.02f",this.getLoiNhuan());
    }
}
public class J05010_SapXepDanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<MatHang> arr=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            sc.nextLine();
            String tenMh=sc.nextLine();
            String nhomMh=sc.nextLine();
            float giaMua=sc.nextFloat();
            float giaBan=sc.nextFloat();
            arr.add(new MatHang(i+1, tenMh, nhomMh, giaMua, giaBan));
        }
        Collections.sort(arr, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang a, MatHang b) {
                return (int) (b.getLoiNhuan()-a.getLoiNhuan());
            }
        });
        for(MatHang x:arr) {
            System.out.println(x);
        }
    }
}
