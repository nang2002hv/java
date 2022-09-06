package J05022;/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 04/09/2022
    Time : 10:11 CH
    ProjectName : Java
    -------------GOOD NIGHT --------
*/

import java.util.ArrayList;

import java.util.Scanner;

public class J05022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien1> ds = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String masinhvien = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            SinhVien1 sinhVien = new SinhVien1(ten,masinhvien,lop,email);
            ds.add(sinhVien);
        }
        //Collections.sort(ds, (J05022.SinhVien1 o1, J05022.SinhVien1 o2) -> o1.getLop().compareTo(o2.getLop()));
        int test = Integer.parseInt(sc.nextLine());
        while(test -- > 0){
            String tenlop = sc.nextLine();
            System.out.printf("DANH SACH SINH VIEN LOP %s:\n", tenlop);
            for(SinhVien1 x : ds){
                if(x.getLop().compareTo(tenlop) == 0)
                    System.out.println(x);
            }
        }

    }
}

