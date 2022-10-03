package Lop_DoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class MatHang {
    private String id, tenHang, donVi;
    private long giaNhap, soLuong, phiVc, thanhTien, giaBan;
    public MatHang() {
        
    }
    public MatHang(int stt, String tenHang, String donVi, long giaNhap, long soLuong) {
        this.id="MH"+String.format("%02d", stt);
        this.tenHang = tenHang;
        this.donVi = donVi;
        this.giaNhap = giaNhap;
        this.soLuong = soLuong;
        this.phiVc=Math.round((double) this.giaNhap*this.soLuong*5/100);
        this.thanhTien=Math.round(this.giaNhap*this.soLuong+this.phiVc);
        this.giaBan=(long) Math.ceil((double) ((this.thanhTien+Math.round((double)(this.thanhTien*2)/100))/this.soLuong)/100)*100;
    }
    public long getGiaBan() {
        return this.giaBan;
    }
    @Override
    public String toString() {
        return this.id+" "+this.tenHang+" "+this.donVi+" "+this.phiVc+" "+this.thanhTien+" "+this.giaBan;
    }
}
public class J05037_TinhGiaBan_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MatHang> arr=new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String tenHang = sc.nextLine();
            String donVi = sc.nextLine();
            long giaNhap = Long.parseLong(sc.nextLine());
            long soLuong = Long.parseLong(sc.nextLine());
            arr.add(new MatHang(i+1,tenHang,donVi,giaNhap,soLuong));
        }
        Collections.sort(arr, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang a, MatHang b) {
                if(a.getGiaBan()<b.getGiaBan()) return 1;
                return -1;
            }
        });
        for(MatHang x:arr) {
            System.out.println(x);
        }
    }
}
