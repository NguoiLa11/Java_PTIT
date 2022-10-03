package Lop_DoiTuong;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class XetTuyen {
    private String id, hoTen, ngaySinh;
    private float d1, d2;
    public XetTuyen() {
        
    }
    public XetTuyen(int stt, String hoTen, String ngaySinh, float d1, float d2) {
        this.id = "PH"+String.format("%02d",stt);
        this.hoTen = hoTen;
        this.ngaySinh= ngaySinh;
        this.d1 = d1;
        this.d2 = d2;
    }
    public int tuoi() {
        String arr[]=this.ngaySinh.split("/");
        return 2021-Integer.parseInt(arr[2]);
    }
    public double diemThuong() {
        if(this.d1>=8 && this.d2>=8) {
            return 1;
        } else if(this.d1>=7.5 && this.d2>=7.5) {
            return 0.5;
        } 
        return 0;
    }
    public int tongDiem() {
        int tb=(int) Math.round((this.d1+this.d2)/2+this.diemThuong());
        if(tb>10) {
            return 10;
        } 
        return tb;
    }
    public String xepLoai() {
        if(this.tongDiem()==9 || this.tongDiem()==10) {
            return "Xuat sac";
        } else if(this.tongDiem()==8) {
            return "Gioi";
        } else if(this.tongDiem()==7) {
            return "Kha";
        } else if(this.tongDiem()>=5 && this.tongDiem()<=6) {
            return "Trung binh";
        } else return "Truot";
    }
    @Override
    public String toString() {
        return this.id+" "+this.hoTen+" "+this.tuoi()+" "+this.tongDiem()+" "+this.xepLoai();
    }
}
public class J05060_KetQuaXetTuyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(System.in);
        ArrayList<XetTuyen> arr=new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
            String hoTen=sc.nextLine();
            String ngaySinh=sc.nextLine();
            float d1=Float.parseFloat(sc.nextLine());
            float d2=Float.parseFloat(sc.nextLine());
            arr.add(new XetTuyen(i+1,hoTen,ngaySinh,d1,d2));
        }
        for(XetTuyen x:arr) {
            System.out.println(x);
        }
    }
}
