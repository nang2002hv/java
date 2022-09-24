/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 24/09/2022
    Time : 4:32 CH
    ProjectName : Java
    -------------GOOD NIGHT --------
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07008 {
    static int []a = new int[25];
    static int []b = new int[25];
    static ArrayList<String> ds = new ArrayList<>();
    static  int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 1; i <= n; i++)
            a[i] = sc.nextInt();
        Try(1,1);
        Collections.sort(ds);
        for(String x : ds){
            System.out.println(x);
        }
    }

    public  static void Try(int i,int k){
        for(int j = k; j <= n; j++){
            if(a[j] > b[i-1]){
                b[i] = a[j];
                if(i >=2){
                    String s = "";
                    for(int x = 1; x <= i; x++){
                        s += String.valueOf(b[x]) +" ";
                    }
                    ds.add(s);
                }
                Try(i+1,j+1);
            }
            
        }
    }
}
