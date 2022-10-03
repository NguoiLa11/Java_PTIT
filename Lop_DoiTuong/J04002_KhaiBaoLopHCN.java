package Lop_DoiTuong;

import java.util.Scanner;

class Rectange {
    private double width, height;
    private String color;
    public Rectange() {
        
    }
    public Rectange(double width, double height, String color) {
        this.width=width;
        this.height=height;
        this.color=color;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double findArea() {
        return (width+height)*2;
    }
    public double findPerimetter() {
        return width*height;
    }
    public String chuanHoa(String color) {
        String res="";
        res+=Character.toUpperCase(color.charAt(0));
        for(int i=1;i<color.length();i++) {
            res+=Character.toLowerCase(color.charAt(i));
        }
        return res;
    }
    @Override
    public String toString() {
        return String.format("%.0f", findArea())+" "+String.format("%.0f", findPerimetter())+" "+chuanHoa(color);
    }
}
public class J04002_KhaiBaoLopHCN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double width=sc.nextDouble();
        double height=sc.nextDouble();
        String color=sc.next();
        Rectange a=new Rectange(width, height, color);
        if(width>0 && height>0) {
            System.out.println(a);
        } else {
            System.out.println("INVALID");
        }
    }
}
