/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 06/09/2022
    Time : 9:36 SA
    ProjectName : Java
    -------------GOOD NIGHT --------
*/


import java.util.Scanner;

class PhanSo1 {
    private long tuso, mauso;

    public PhanSo1(long tuso, long mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }

    public long getTuso() {
        return tuso;
    }

    public void setTuso(long tuso) {
        this.tuso = tuso;
    }

    public long getMauso() {
        return mauso;
    }

    public void setMauso(long mauso) {
        this.mauso = mauso;
    }


    public static long gcd(long a, long b){
        if(b == 0) return a;
        else return gcd(b, a%b);
    }

    public static PhanSo1 rutgon(PhanSo1 p1){
        long tmp = PhanSo1.gcd(p1.getTuso(), p1.getMauso());
        p1.setTuso(p1.getTuso()/tmp);
        p1.setMauso(p1.getMauso()/tmp);
        return p1;
    }

    public static PhanSo1 congPhanSo(PhanSo1 p1, PhanSo1 p2){
        PhanSo1 p3 = new PhanSo1(0, 0);
        long tmp = PhanSo1.gcd(p1.getMauso(), p2.getMauso());
        tmp = p1.getMauso()*p2.getMauso()/tmp;
        p3.setMauso(tmp);
        p3.setTuso((tmp/p1.getMauso())*p1.tuso + (tmp/p2.mauso)*p2.tuso);
        return p3;
    }

    public static PhanSo1 xuly(PhanSo1 p1, PhanSo1 p2){
        p1 = PhanSo1.rutgon(p1);
        p2 = PhanSo1.rutgon(p2);
        PhanSo1 p3 = new PhanSo1(0, 0);
        p3 = PhanSo1.congPhanSo(p1, p2);
        return PhanSo1.rutgon(p3);
    }

    @Override
    public String toString() {
        return this.tuso+"/"+this.mauso;
    }
}

public class J04004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo1 p1 = new PhanSo1(sc.nextLong(), sc.nextLong());
        PhanSo1 p2 = new PhanSo1(sc.nextLong(), sc.nextLong());
        PhanSo1 p3 = new PhanSo1(0,0);
        p3 = PhanSo1.xuly(p1,p2);
        System.out.println(p3);
    }

}
