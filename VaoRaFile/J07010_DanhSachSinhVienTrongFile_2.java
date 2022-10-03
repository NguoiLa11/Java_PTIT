package VaoRaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class SinhVien {
    private String hoTen, lopHoc, ngaySinh;
    private float gpa;
    public SinhVien () {
        
    }
    public SinhVien(String hoTen, String lopHoc, String ngaySinh, float gpa) {
        this.hoTen = hoTen;
        this.lopHoc = lopHoc;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }
    public void nhap(Scanner sc) {
        sc.nextLine();
        hoTen=sc.nextLine();
        lopHoc=sc.nextLine();
        ngaySinh=sc.nextLine();
        gpa=sc.nextFloat();
    }
    public void chuanHoa() {
        String a[]=this.ngaySinh.split("/");
        if(a[0].length()==1) a[0]=0+a[0];
        if(a[1].length()==1) a[1]=0+a[1];
        this.ngaySinh=a[0]+"/"+a[1]+"/"+a[2];
    }
    public void in() {
        chuanHoa();
        System.out.println(hoTen+" "+lopHoc+" "+ngaySinh+" "+String.format("%.02f",gpa));
    }
}
public class J07010_DanhSachSinhVienTrongFile_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("SV.in"));
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            SinhVien a=new SinhVien();
            a.nhap(sc);
            System.out.print("B20DCCN"+String.format("%03d",i+1)+" ");
            a.in();
        }
    }
}
