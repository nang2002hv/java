/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 06/09/2022
    Time : 11:21 SA
    ProjectName : Java
    -------------GOOD NIGHT --------
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05028 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        ArrayList <DoanhNhiep> ds = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String madoanhnhiep = sc.nextLine();
            String tendoanhnghiep = sc.nextLine();
            int sosinhvien = Integer.parseInt(sc.nextLine());
            DoanhNhiep doanhNhiep = new DoanhNhiep(madoanhnhiep,tendoanhnghiep,sosinhvien);
            ds.add(doanhNhiep);
        }
        Collections.sort(ds, (DoanhNhiep o1, DoanhNhiep o2) -> {
            if(o1.getSosinhvien() != o2.getSosinhvien()) return o2.getSosinhvien()-o1.getSosinhvien();
            return o1.getMadoanhnghiep().compareTo(o2.getMadoanhnghiep());
        });
        for(DoanhNhiep x : ds){
            System.out.println(x);
        }
    }
}

class DoanhNhiep{
    private String madoanhnghiep, tendoanhnghiep;
    private int sosinhvien;

    public DoanhNhiep(String madoanhnghiep, String tendoanhnghiep, int sosinhvien) {
        this.madoanhnghiep = madoanhnghiep;
        this.tendoanhnghiep = tendoanhnghiep;
        this.sosinhvien = sosinhvien;
    }

    public int getSosinhvien() {
        return sosinhvien;
    }

    public String getMadoanhnghiep() {
        return madoanhnghiep;
    }

    @Override
    public String toString() {
        return this.madoanhnghiep + " "+ this.tendoanhnghiep + " "+ this.sosinhvien;
    }
}
