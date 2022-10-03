package Lop_DoiTuong;

import java.util.ArrayList;
import java.util.Scanner;

class MatHang {
    private String id, tenHang;
    private long soLuong, donGia, x, thanhTien;
    public MatHang() {
        
    }
    public String chuanHoa() {
        String a[]=this.tenHang.split("\\s+");
        String res="";
        for(int i=0;i<a.length;i++) {
            res+=Character.toUpperCase(a[i].charAt(0));
        }
        return res;
    }
    public MatHang(int stt, String tenHang, long soLuong, long donGia) {
        this.id=chuanHoa()+String.format("%02d",stt);
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
        long ans=soLuong*donGia;
        if(this.soLuong>10) {
            x=ans*5/100;
        } else if(this.soLuong>=8 && this.soLuong<=10) {
            x=ans*2/100;
        } else if(this.soLuong>=5 && this.soLuong<8) {
            x=ans*1/100;
        } else if(this.soLuong<5) {
            x=0;
        }
        this.thanhTien=ans-x;
    }
}
public class J05046_BangKeNhapKho {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<MatHang> arr=new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
            String tenHang=sc.nextLine();
            long soLuong=Long.parseLong(sc.nextLine());
            long donGia=Long.parseLong(sc.nextLine());
            arr.add(new MatHang(i+1,tenHang,soLuong,donGia));
        }
        for(MatHang x:arr) {
            System.out.println(x);
        }
    }
}
