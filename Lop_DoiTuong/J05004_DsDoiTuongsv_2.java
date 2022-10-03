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
        hoTen=sc.nextLine().trim();
        lopHoc=sc.next();
        ngaySinh=sc.next();
        gpa=sc.nextFloat();
    }
    public void chuanhoa1() {
        String arr[]=this.ngaySinh.split("/");
        if(arr[0].length()==1) arr[0]=0+arr[0];
        if(arr[1].length()==1) arr[1]=0+arr[1];
        this.ngaySinh=arr[0]+"/"+arr[1]+"/"+arr[2];
    }
    public void chuanhoa2() {
        String a[]=this.hoTen.split("\\s+");
        String res="";
        for(int i=0;i<a.length;i++) {
            res+=Character.toUpperCase(a[i].charAt(0));
            for(int j=1;j<a[i].length();j++) {
                res+=Character.toLowerCase(a[i].charAt(j));
            }
            res+=" ";
        }
        System.out.print(res);
    }
    public void in() {
        chuanhoa1();
        chuanhoa2();
        System.out.println(" "+lopHoc+" "+ngaySinh+" "+String.format("%.2f",gpa));
    }
}
public class J05004_DsDoiTuongsv_2 {
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
//1
//nGuyEn  vaN    biNH
//D20CQCN01-B
//2/12/2002
//3.1