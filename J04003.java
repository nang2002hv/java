/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 06/09/2022
    Time : 9:35 SA
    ProjectName : Java
    -------------GOOD NIGHT --------
*/


import java.util.Scanner;

class PhanSo {
    private long tuso, mauso;

    public PhanSo(long tuso, long mauso) {
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

    public static PhanSo xuly(PhanSo p1){
        long tmp = gcd(p1.getTuso(), p1.getMauso());
        p1.setTuso(p1.getTuso()/tmp);
        p1.setMauso(p1.getMauso()/tmp);
        return p1;
    }

    @Override
    public String toString() {
        return this.tuso+"/"+this.mauso;
    }
}

public class J04003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo p1 = new PhanSo(sc.nextLong(), sc.nextLong());
        PhanSo p2 = new PhanSo(0, 0);
        p2 = PhanSo.xuly(p1);
        System.out.println(p2);
    }

}

