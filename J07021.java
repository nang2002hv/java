/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 24/09/2022
    Time : 12:28 SA
    ProjectName : Java
    -------------GOOD NIGHT --------
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07021 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNext()){
            String s = sc.nextLine();
            s = s.trim();
            if(s.compareTo("END") == 0) break;
            String k = "";
            String a[] = s.split("\\s+");
            for (String x : a){
                x = x.toLowerCase();
                k += Character.toUpperCase(x.charAt(0));
                k += x.substring(1,x.length());
                k+=" ";
            }
            System.out.println(k);
        }
    }
}
