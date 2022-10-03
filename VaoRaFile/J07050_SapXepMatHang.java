package VaoRaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class MatHang {
    private String id, tenMh, nhomHang;
    private float giaMua, giaBan, loiNhuan;
    public MatHang() {
        
    }
    public MatHang(int stt, String tenMh, String nhomHang, float giaMua, float giaBan) {
        this.id="MH"+String.format("%02d", stt);
        this.tenMh = tenMh;
        this.nhomHang = nhomHang;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan=this.giaBan-this.giaMua;
    }
    public float getLoiNhuan() {
        return this.loiNhuan;
    }
    @Override
    public String toString() {
        return id+" "+tenMh+" "+nhomHang+" "+String.format("%.02f",loiNhuan);
    }
}
public class J07050_SapXepMatHang {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("MATHANG.in"));
        ArrayList<MatHang> arr=new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
            String tenMh=sc.nextLine();
            String nhomHang=sc.nextLine();
            float giaMua=Float.parseFloat(sc.nextLine());
            float giaBan=Float.parseFloat(sc.nextLine());
            arr.add(new MatHang(i+1,tenMh,nhomHang,giaMua,giaBan));
        }
        Collections.sort(arr, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang a, MatHang b) {
                if(a.getLoiNhuan()<b.getLoiNhuan()) return 1;
                return -1;
            }
        });
        for(MatHang x:arr) {
            System.out.println(x);
        }
    }
}
