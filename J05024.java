/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 05/09/2022
    Time : 12:40 CH
    ProjectName : Java
    -------------GOOD NIGHT --------
*/

import com.sun.source.tree.ReturnTree;

import java.util.ArrayList;

import java.util.Scanner;

public class J05024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien5> ds = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String masinhvien = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            SinhVien5 sinhVien = new SinhVien5(ten,masinhvien,lop,email);
            ds.add(sinhVien);
        }
        //Collections.sort(ds, (J05022.SinhVien1 o1, J05022.SinhVien1 o2) -> o1.getLop().compareTo(o2.getLop()));
        int test = Integer.parseInt(sc.nextLine());
        while(test -- > 0){
            String tenlop = sc.nextLine();
            String tmp ="";
            if(tenlop.compareTo("Ke toan") == 0) tmp = "DCKT";
            if(tenlop.compareTo("Cong nghe thong tin") == 0) tmp = "DCCN";
            if(tenlop.compareTo("An toan thong tin") == 0) tmp = "DCAT";
            if(tenlop.compareTo("Vien thong") == 0) tmp = "DCVT";
            if(tenlop.compareTo("Dien tu") == 0) tmp = "DCDT";
            tenlop = tenlop.toUpperCase();
            System.out.printf("DANH SACH SINH VIEN NGANH %s:\n", tenlop);
            for(SinhVien5 x : ds){
                if(x.getMasinhvien().substring(3,7).compareTo(tmp) == 0)
                    if(tmp == "DCCN" || tmp =="DCAT"){
                        if(x.getMasinhvien().charAt(0) != 'E'){
                            System.out.println(x);
                        }
                    }
                    else System.out.println(x);
            }
        }

    }
}

class SinhVien5{
    private  String ten, masinhvien,lop,email;

    public SinhVien5(String ten, String masinhvien, String lop, String email) {
        this.ten = ten;
        this.masinhvien = masinhvien;
        this.lop = lop;
        this.email = email;
    }


    public String getMasinhvien() {
        return masinhvien;
    }

    @Override
    public String toString() {
        return this.masinhvien +" "+this.ten + " "+ this.lop+" "+ this.email;
    }
}


