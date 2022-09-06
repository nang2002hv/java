/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 06/09/2022
    Time : 9:32 SA
    ProjectName : Java
    -------------GOOD NIGHT --------
*/
import java.util.Scanner;


public class J04001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Point1 p1 = new Point1(sc.nextDouble(), sc.nextDouble());
            Point1 p2 = new Point1(sc.nextDouble(), sc.nextDouble());
            System.out.println(String.format("%.4f", Point1.distance(p1, p2)));
        }
    }
}

class Point1 {
    private double x, y;

    public Point1() {
    }

    public Point1(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double distance(Point1 secondPoint){
        return Math.sqrt((secondPoint.getX() - x)*(secondPoint.getX()-x)+(secondPoint.getY()-y)*(secondPoint.getY()-y));
    }

    public static double distance(Point1 p1, Point1 p2){
        return Math.sqrt((p2.getX() - p1.getX())*(p2.getX()-p1.getX())+(p2.getY()-p1.getY())*(p2.getY()-p1.getY()));
    }

    @Override
    public String toString() {
        return  this.x +" "+ this.y;
    }


}