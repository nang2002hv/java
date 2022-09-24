package BaiLam;/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 12/09/2022
    Time : 4:02 CH
    ProjectName : J05046
    -------------GOOD NIGHT --------
*/

import java.util.ArrayList;
import java.util.Scanner;

public class AMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList <BangKeNhapKho> ds = new ArrayList<>();
        while (t-- > 0){
            String tenhang = sc.nextLine();
            long soluong = Long.parseLong(sc.nextLine());
            long dongia = Long.parseLong(sc.nextLine());
            BangKeNhapKho bangKeNhapKho = new BangKeNhapKho(tenhang,soluong,dongia);
            bangKeNhapKho.xuLy();
            ds.add(bangKeNhapKho);
        }
        for (BangKeNhapKho x : ds) {
            System.out.println(x);
        }
    }
}
