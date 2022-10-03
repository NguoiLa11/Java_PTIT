package VaoRaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class XepLoai {
    private String id, hoTen, ans;
    private float d1,d2,d3, tongDiem;
    public XepLoai() {
        
    }
    public XepLoai(int stt, String hoTen, float d1, float d2, float d3) {
        this.id = "SV"+String.format("%02d", stt);
        this.hoTen = hoTen;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.tongDiem=(float)(this.d1*25/100+this.d2*35/100+this.d3*40/100);
        if(this.tongDiem>=8) {
            this.ans="GIOI";
        } else if(this.tongDiem>=6.5 && this.tongDiem<8) {
            this.ans="KHA";
        } else if(this.tongDiem>=5 && this.tongDiem<6.5) {
            this.ans="TRUNG BINH";
        } else {
            this.ans="KEM";
        }
    }
    public float getTongDiem() {
        return this.tongDiem;
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
    @Override
    public String toString() {
        return this.id+" "+chuanHoa(this.hoTen)+" "+String.format("%.02f", tongDiem)+" "+this.ans;
    }
}
public class J07055_XepLoai {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("BANGDIEM.in"));
        ArrayList<XepLoai> arr=new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
            String hoTen=sc.nextLine().trim();
            float d1=Float.parseFloat(sc.nextLine());
            float d2=Float.parseFloat(sc.nextLine());
            float d3=Float.parseFloat(sc.nextLine());
            arr.add(new XepLoai(i+1, hoTen, d1, d2, d3));
        }
        Collections.sort(arr, new Comparator<XepLoai>() {
            @Override
            public int compare(XepLoai a, XepLoai b) {
                if(a.getTongDiem()<b.getTongDiem()) return 1;
                return -1;
            }
        });
        for(XepLoai x:arr) {
            System.out.println(x);
        }
    }
}
