package Lop_DoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Time {
    private String id, hoTen, gioVao, gioRa;
    public Time() {
        
    }
    public Time(String id, String hoTen, String gioVao, String gioRa) {
        this.id = id;
        this.hoTen = hoTen;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
    }
    public int thoiGian() {
        String arr1[]=this.gioVao.split(":");
        String arr2[]=this.gioRa.split(":");
        int hour1=Integer.parseInt(arr1[0]);
        int minute1=Integer.parseInt(arr1[1]);
        int hour2=Integer.parseInt(arr2[0]);
        int minute2=Integer.parseInt(arr2[1]);;
        return (hour2*60+minute2)-(hour1*60+minute1);
    }
    public int getThoiGian() {
        return this.thoiGian();
    }
    public String time() {
        String hour=Integer.toString(thoiGian()/60);
        String minute=Integer.toString(thoiGian()%60);
        return hour+" gio "+minute+" phut";
    } 
    @Override
    public String toString() {
        return this.id+" "+this.hoTen+" "+time();
    }
}
public class J05011_TinhGio {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Time> arr=new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
            String id=sc.nextLine();
            String hoTen=sc.nextLine();
            String gioVao=sc.nextLine();
            String gioRa=sc.nextLine();
            arr.add(new Time(id,hoTen,gioVao,gioRa));
        }
        Collections.sort(arr, new Comparator<Time>() {
            @Override
            public int compare(Time a, Time b) {
                return b.getThoiGian()-a.getThoiGian();
            }
        });
        for(Time x:arr) {
            System.out.println(x);
        }
    }
}
