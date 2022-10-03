package Lop_DoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class GiangVien {
    private String id, hoTen, boMon, ten;
    public GiangVien() {
        
    }
    public GiangVien(int stt, String hoTen, String boMon) {
        this.id="GV"+String.format("%02d",stt);
        this.hoTen = hoTen;
        this.boMon = boMon;
        String a[]=this.hoTen.split("\\s+");
        this.ten=a[a.length-1];
    }
    public String getTen() {
        return this.ten;
    }
    public String getId() {
        return this.id;
    }
    public String chuanHoa(String boMon) {
        String a[]=this.boMon.split("\\s+");
        String res="";
        for(int i=0;i<a.length;i++) {
            res+=Character.toUpperCase(a[i].charAt(0));
        }
        return res;
    }
    @Override
    public String toString() {
        return this.id+" "+this.hoTen+" "+chuanHoa(this.boMon);
    }
}
public class J05025_SapXepDanhSachGiangVien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<GiangVien> arr=new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
            String hoTen=sc.nextLine();
            String boMon=sc.nextLine();
            arr.add(new GiangVien(i+1,hoTen,boMon));
        }
        Collections.sort(arr, new Comparator<GiangVien>() {
            @Override
            public int compare(GiangVien a, GiangVien b) {
                if(a.getTen().equals(b.getTen())) {
                    return a.getId().compareTo(b.getId());
                } else {
                    return a.getTen().compareTo(b.getTen());
                }
            }
        });
        for(GiangVien x:arr) {
            System.out.println(x);
        }
    }
}
