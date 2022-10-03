package VaoRaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SinhVien {
    private String maSv, hoTen, lopHoc, mail;
    public SinhVien() {
        
    }
    public SinhVien(String maSv, String hoTen, String lopHoc, String mail) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.lopHoc = lopHoc;
        this.mail = mail;
    }
    public String chuanHoa(String hoTen) {
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
    public String getMaSv() {
        return this.maSv;
    }
    @Override
    public String toString() {
        return maSv+" "+chuanHoa(hoTen)+" "+lopHoc+" "+mail;
    }
}
public class J07033_DanhSachSinhVienTrongFile_1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("SINHVIEN.in"));
        ArrayList<SinhVien> arr=new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
            String maSv=sc.nextLine();
            String hoTen=sc.nextLine().trim();
            String lopHoc=sc.nextLine();
            String mail=sc.nextLine();
            arr.add(new SinhVien(maSv, hoTen, lopHoc, mail));
        }
        Collections.sort(arr, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien a, SinhVien b) {
                return a.getMaSv().compareTo(b.getMaSv());
            }
        });
        for(SinhVien x:arr) {
            System.out.println(x);
        }
    }
}
