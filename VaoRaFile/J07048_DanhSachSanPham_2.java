package VaoRaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SanPham {
    private String maSp, tenSp;
    private int giaBan, thoiGianBh;
    public SanPham() {
        
    }
    public SanPham(String maSp, String tenSp, int giaBan, int thoiGianBh) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.giaBan = giaBan;
        this.thoiGianBh = thoiGianBh;
    }
    public int getGiaBan() {
        return this.giaBan;
    }
    public String getMaSp() {
        return this.maSp;
    }
    @Override
    public String toString() {
        return  this.maSp+" "+this.tenSp+" "+this.giaBan+" "+this.thoiGianBh;
    }
}
public class J07048_DanhSachSanPham_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("SANPHAM.in"));
        ArrayList<SanPham> arr=new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
            String maSp=sc.nextLine();
            String tenSp=sc.nextLine();
            int giaBan=Integer.parseInt(sc.nextLine());
            int thoiGianBh=Integer.parseInt(sc.nextLine());
            arr.add(new SanPham(maSp,tenSp,giaBan,thoiGianBh));
        }
        Collections.sort(arr, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham a, SanPham b) {
                if(a.getGiaBan()!=b.getGiaBan()) {
                    return b.getGiaBan()-a.getGiaBan();
                } else {
                    return a.getMaSp().compareTo(b.getMaSp());
                }
            }
        });
        for(SanPham x:arr) {
            System.out.println(x);
        }
    }
}
