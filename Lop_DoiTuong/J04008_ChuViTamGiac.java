package Lop_DoiTuong;

import static Lop_DoiTuong.Point.distance;
import java.util.Scanner;

class Point {
    private double x, y;
    public Point() {
        
    }
    public Point(double x, double y) {
        this.x=x;
        this.y=y;
    }
    public Point(Point p) {
        this.x=p.x;
        this.y=p.y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public static double distance(Point p1, Point p2) {
        double ans=Math.sqrt(Math.pow(p1.x-p2.x,2)+Math.pow(p1.y-p2.y,2));
        return ans;
    }
}
public class J04008_ChuViTamGiac {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            double x1=sc.nextDouble();
            double y1=sc.nextDouble();
            double x2=sc.nextDouble();
            double y2=sc.nextDouble();
            double x3=sc.nextDouble();
            double y3=sc.nextDouble();
            Point a=new Point(x1,y1);
            Point b=new Point(x2,y2);
            Point c=new Point(x3,y3);
            double x=distance(a,b);
            double y=distance(a,c);
            double z=distance(c,b);
            if(x+y<=z || x+z<=y || y+z<=x) {
                System.out.println("INVALID");
            } else {
                double ans=x+y+z;
                System.out.println(String.format("%.3f", ans));
            }
        }
    }
}
