package Lop_DoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        String a[]=this.ngaySinh.split("/");
        return 2021-Integer.parseInt(a[2]);
    }
    public double diemThuong() {
        if(this.d1>=8 && this.d2>=8) {
            return 1;
        } else if(this.d1>=7.5 && this.d2>=7.5) {
            return 0.5;
        }
        return 0;
    }
    public long tongDiem() {
        float tb=(this.d1+this.d2)/2;
        if(tb+this.diemThuong()>10) {
            return 10;
        }
        return Math.round(tb+this.diemThuong());
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
    public String getId() {
        return this.id;
    }
    public long getTongDiem() {
        return this.tongDiem();
    }
    @Override
    public String toString() {
        return this.id+" "+this.hoTen+" "+tuoi()+" "+tongDiem()+" "+xepLoai();
    }
}
public class J05061_SapXepKqXetTuyen {
    public static void main(String[] args) {
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
        Collections.sort(arr, new Comparator<XetTuyen>() {
            @Override
            public int compare(XetTuyen a, XetTuyen b) {
                if(a.getTongDiem()<b.getTongDiem()) return 1;
                else if(a.getTongDiem()>b.getTongDiem()) {
                    return -1;
                } else {
                    return a.getId().compareTo(b.getId());
                }
            }
        });
        for(XetTuyen x:arr) {
            System.out.println(x);
        }
    }
}
