package Lop_DoiTuong;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class ThoiGian {
    private int gio, phut, giay;
    public ThoiGian() {

    }
    public ThoiGian(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }
    public void nhap(Scanner sc) {
        gio = sc.nextInt();
        phut = sc.nextInt();
        giay = sc.nextInt();
    }
    public int getTime() {
        return gio * 3600 + phut * 60 + giay;
    }
    @Override
    public String toString() {
        return this.gio+" "+this.phut+" "+this.giay;
    }
}
public class J05033_SapXepThoiGian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ThoiGian> arr=new ArrayList<>();
        for(int i=0;i<n;i++) {
            ThoiGian t=new ThoiGian();
            t.nhap(sc);
            arr.add(t);
        }
        Collections.sort(arr,new Comparator<ThoiGian>() {
            @Override
            public int compare(ThoiGian a, ThoiGian b) {
                return a.getTime()-b.getTime();
            }
        });
        for(ThoiGian x:arr) {
            System.out.println(x);
        }
    }
}
//3
//11 20 20
//14 20 14
//11 15 12