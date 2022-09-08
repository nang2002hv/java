package GiaBan;
/* Welcome to Nguyen Trac Nang 
    @author : ASUS
    Date : 08/09/2022
    Time : 11:00 SA
    ProjectName : J05036
    -------------GOOD NIGHT --------
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <TinhGiaBan> ds = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String ten = sc.nextLine();
            String donvitinh = sc.nextLine();
            Double dongia= Double.parseDouble(sc.nextLine());
            Double soluong= Double.parseDouble(sc.nextLine());
            TinhGiaBan tinhGiaBan = new TinhGiaBan(ten,donvitinh,dongia,soluong);
            ds.add(tinhGiaBan);
        }
        for (TinhGiaBan x : ds){
            System.out.println(x);
        }
    }
}
