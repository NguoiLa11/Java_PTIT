package Lop_DoiTuong;

import java.util.Scanner;

class SinhVien {
    private String hoTen, lopHoc, ngaySinh;
    private float gpa;
    public SinhVien() {
        
    }
    public SinhVien(String hoTen, String lopHoc, String ngaySinh, float gpa) {     
        this.hoTen=hoTen;
        this.lopHoc=lopHoc;
        this.ngaySinh=ngaySinh;
        this.gpa=gpa;
    }
    public void nhap(Scanner sc) {
        sc.nextLine();
        hoTen=sc.nextLine();
        lopHoc=sc.next();
        ngaySinh=sc.next();
        gpa=sc.nextFloat();
    }
    public void chuanhoa() {
        String arr[]=this.ngaySinh.split("/");
        if(arr[0].length()==1) arr[0]=0+arr[0];
        if(arr[1].length()==1) arr[1]=0+arr[1];
        this.ngaySinh=arr[0]+"/"+arr[1]+"/"+arr[2];
    }
    public void in() {
        chuanhoa();
        System.out.println(hoTen+" "+lopHoc+" "+ngaySinh+" "+String.format("%.2f", gpa));
    }
}
public class J05003_DsDoiTuongSv_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            SinhVien a=new SinhVien();
            a.nhap(sc);
            System.out.print("B20DCCN"+String.format("%03d", i)+" ");
            a.in();
        }
    }
}
