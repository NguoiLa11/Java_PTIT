package Lop_DoiTuong;

import java.util.ArrayList;
import java.util.Scanner;

class SinhVien {
    private int id;
    private String hoTen, ngaySinh;
    private float d1,d2,d3,totalScores;
    protected static double maxScores;
    public SinhVien() {
        
    }
    public SinhVien(int id, String hoTen, String ngaySinh, float d1, float d2, float d3) {
        this.id=id;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.totalScores=this.d1+this.d2+this.d3;
        maxScores=Math.max(maxScores, this.totalScores);
        
    }
    public double getTotalScores() {
        return this.totalScores;
    }
    @Override
    public String toString() {
        return this.id+" "+this.hoTen+" "+this.ngaySinh+" "+this.totalScores;
    }
}
public class J05009_ThuKhoaKyThi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        ArrayList<SinhVien> arr=new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
            String hoTen = sc.nextLine();
            String ngaySinh = sc.nextLine();
            float d1= Float.parseFloat(sc.nextLine());
            float d2= Float.parseFloat(sc.nextLine());
            float d3= Float.parseFloat(sc.nextLine());
            arr.add(new SinhVien(i+1,hoTen,ngaySinh,d1,d2,d3));
        }
        for(SinhVien x:arr){
            if(x.getTotalScores()==SinhVien.maxScores) {
                System.out.println(x);
            }
        }
    }
}
