package VaoRaFile;

import java.io.File;
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
        } return 0;
    }
    public long tongDiem() {
        double tb=(this.d1+this.d2)/2;
        if(tb+this.diemThuong()>10) {
            return 10;
        } 
        return Math.round(tb+this.diemThuong());
    }
    public String xepLoai() {
        if(this.tongDiem()>=9) {
            return "Xuat sac";
        } else if(this.tongDiem()==8) {
            return "Gioi";
        } else if(this.tongDiem()==7) {
            return "Kha";
        } else if(this.tongDiem()<=6 && this.tongDiem()>=5) {
            return "Trung binh";
        } else return "Truot";
    }
    public String chuanHoa1() {
        String a[]=this.ngaySinh.split("/");
        if(a[0].length()==1) a[0]=0+a[0];
        if(a[1].length()==1) a[1]=0+a[1];
        return this.ngaySinh=a[0]+"/"+a[1]+"/"+a[2];
    }
    public String ChuanHoa2(String hoTen) {
        String a[]=this.hoTen.split("\\s+");
        String res="";
        for(int i=0;i<a.length;i++) {
            res+=Character.toUpperCase(a[i].charAt(0));
            for(int j=1;j<a[i].length();j++) {
                res+=Character.toLowerCase(a[i].charAt(j));
            }
            res+=" ";
        }
        return res;
    }
    @Override
    public String toString() {
        chuanHoa1();
        return this.id+" "+ChuanHoa2(this.hoTen)+" "+this.tuoi()+" "+this.tongDiem()+" "+this.xepLoai();
    }
}
public class J07053_XetTuyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("XETTUYEN.in"));
        ArrayList<XetTuyen> arr=new ArrayList<>();
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++) {
            String hoTen=sc.nextLine().trim();
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
