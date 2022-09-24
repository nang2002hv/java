/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 06/09/2022
    Time : 9:27 SA
    ProjectName : Java
    -------------GOOD NIGHT --------
*/

import java.util.Scanner;

public class J04019 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }

}

class Point {
    private double x , y;

    public Point(){

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Point nextPoint(Scanner sc){
        Point point = new Point(0,0);
        point.x = sc.nextDouble(); point.y = sc.nextDouble();
        return point;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}


class Triangle {
    private Point a, b, c;
    private static double ab = 0,ac = 0,bc = 0 ;

    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static double llength(Point p1, Point p2){
        return Math.sqrt ((p1.getX() - p2.getX()) * (p1.getX() - p2.getX()) + (p1.getY()-p2.getY()) * (p1.getY()-p2.getY()));
    }


    public boolean valid(){
        ab = Triangle.llength(a, b);
        ac = Triangle.llength(a, c);
        bc = Triangle.llength(b, c);
        return ab + ac > bc && ab+bc > ac && ac + bc > ab;
    }

    public String getPerimeter(){
        double chuVi = (ab+bc+ac);
        double tmp = chuVi/2;
        return String.format("%.3f",chuVi);
    }

}

