/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 06/09/2022
    Time : 9:34 SA
    ProjectName : Java
    -------------GOOD NIGHT --------
*/


import java.util.*;

class Rectange {
    private int width, height;
    private static String color;

    public Rectange() {
    }

    public Rectange(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static void setColor(String color) {
        Rectange.color = color;
    }



    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public static String getColor() {
        return color;
    }

    public  double findArea(){
        return this.height*this.width;
    }

    public  double findPerimeter(){
        return 2*(this.height+this.width);
    }

    @Override
    public String toString() {
        return (int)findPerimeter() +" "+ (int)findArea() +" "+color;
    }
}

public class J04002 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rectange hcn = new Rectange();
        hcn.setHeight(sc.nextInt());
        hcn.setWidth(sc.nextInt());
        String a = sc.next();
        a = a.toLowerCase();
        String b ="";
        b +=  Character.toUpperCase(a.charAt(0));
        b += a.substring(1,a.length());
        Rectange.setColor(b);
        if(hcn.getHeight() <= 0 || hcn.getWidth() <= 0){
            System.out.println("INVALID");
            return;
        }
        System.out.println(hcn);
    }

}

