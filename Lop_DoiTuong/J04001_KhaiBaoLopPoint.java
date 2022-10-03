package Lop_DoiTuong;

import java.util.Scanner;

class Point {
    private double x,y;
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
    public double distance(Point secondPoint) {
        double kc=Math.sqrt((x-secondPoint.x)*(x-secondPoint.x)+(y-secondPoint.y)*(y-secondPoint.y));
        return kc;
    }
    public double distance(Point p1, Point p2) {
        double kc=Math.sqrt((p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y));
        return kc;
    }
}
public class J04001_KhaiBaoLopPoint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            double a=sc.nextDouble();
            double b=sc.nextDouble();
            double c=sc.nextDouble();
            double d=sc.nextDouble();
            Point x1=new Point(a,b);
            Point x2=new Point(c,d);
            double ans=x1.distance(x2);
            System.out.printf("%.4f", ans);
            System.out.println("");
        }
    }
}
