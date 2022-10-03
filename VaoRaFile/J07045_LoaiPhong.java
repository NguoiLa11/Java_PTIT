package VaoRaFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class LoaiPhong implements Comparable<LoaiPhong>{
    private String kyHieu, tenPhong;
    private int donGia;
    private float phiPv;
    public LoaiPhong() {
        
    }
    public LoaiPhong(String kyHieu, String tenPhong, int donGia, float phiPv) {
        this.kyHieu = kyHieu;
        this.tenPhong = tenPhong;
        this.donGia = donGia;
        this.phiPv = phiPv;
    }
    public LoaiPhong(String s) {
        String a[]=s.split("\\s+");
        this.kyHieu=a[0];
        this.tenPhong=a[1];
        this.donGia=Integer.parseInt(a[2]);
        this.phiPv=Float.parseFloat(a[3]);
    }
//    public String getTenPhong() {
//        return this.tenPhong;
//    }
    public int sort(LoaiPhong a) {
        return this.tenPhong.compareTo(a.tenPhong);
    }
    @Override 
    public String toString() {
        return this.kyHieu+" "+this.tenPhong+" "+this.donGia+" "+this.phiPv;
    }

    @Override
    public int compareTo(LoaiPhong arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
public class J07045_LoaiPhong {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
