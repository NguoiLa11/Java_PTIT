package Lop_DoiTuong;

import java.util.ArrayList;
import java.util.Scanner;

class GiangVien {
    private String id, hoTen, boMon;
    public GiangVien() {
        
    }
    public GiangVien(int stt, String hoTen, String boMon) {
        this.id="GV"+String.format("%02d", stt);
        this.hoTen = hoTen;
        this.boMon = boMon;
    }
    public String chuanHoa(String boMon) {
        String a[]=this.boMon.split("\\s+");
        String res="";
        for(int i=0;i<a.length;i++) {
            res+=Character.toUpperCase(a[i].charAt(0));
        }
        return res;
    }
    public String getHoTen() {
        return this.hoTen;
    }
    @Override
    public String toString() {
        return this.id+" "+this.hoTen+" "+chuanHoa(this.boMon);
    }
}
public class J05027_TimKiemGiangVien {
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
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0) {
            String s=sc.next();
            String key=s.toLowerCase();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA "+s+":");
            for(GiangVien x:arr) {
                if(x.getHoTen().toLowerCase().contains(key)) {
                    System.out.println(x);
                }
            }
        }
    }
}
