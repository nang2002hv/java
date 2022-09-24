package BaiLam;/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 12/09/2022
    Time : 4:02 CH
    ProjectName : J05046
    -------------GOOD NIGHT --------
*/

import java.util.HashMap;

public class BangKeNhapKho {
    static HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
    String tenhang, mamathang;
    long soluong, dongia, chietkhau, thanhtien;

    public BangKeNhapKho(String tenhang, long soluong, long dongia) {
        this.tenhang = tenhang;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public void xuLy() {
        tenhang = tenhang.trim();
        String a[] = tenhang.split("\\s+");
        String stt = "";
        String s = String.valueOf(a[0].charAt(0)).toUpperCase() + String.valueOf(a[1].charAt(0)).toUpperCase();
        if (hashMap.containsKey(s)) {
            int tmp = hashMap.get(s);
            tmp++;
            stt = String.valueOf(tmp);
            hashMap.put(s, tmp);
        } else {
            hashMap.put(s, 1);
            stt = "1";
        }
        while (stt.length() < 2) stt = "0" + stt;
        mamathang = s + stt;
        if (soluong > 10) chietkhau = (soluong * dongia * 5)/100;
        if (soluong >= 8 && soluong <= 10) chietkhau = dongia * soluong * 2 / 100;
        if (soluong >= 5 && soluong < 8) chietkhau = dongia * soluong / 100;
        if (soluong < 5) chietkhau = 0;
        thanhtien = soluong * dongia - chietkhau;
    }

    @Override
    public String toString() {
        return this.mamathang + " " + this.tenhang + " " + this.chietkhau + " " + this.thanhtien;
    }
}
