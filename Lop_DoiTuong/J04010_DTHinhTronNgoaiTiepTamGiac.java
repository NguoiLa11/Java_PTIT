package Lop_DoiTuong;

import static Lop_DoiTuong.Point.distance;
import java.util.Scanner;

class Point {
    private double x, y;
    public Point() {

    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }
}
public class J04010_DTHinhTronNgoaiTiepTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();
            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            Point p3 = new Point(x3, y3);
            double a = distance(p1, p2);
            double b = distance(p1, p3);
            double c = distance(p2, p3);
            if (a + b <= c || a + c <= b || b + c <= a) {
                System.out.println("INVALID");
            } else {
                double p = (a + b + c) / 2;
                double s=Math.sqrt(p * (p - a) * (p - b) * (p - c));
                double r=a*b*c/(4*s);
                double ans=Math.PI*r*r;
                System.out.println(String.format("%.3f", ans));
            }
        }
    }
}
