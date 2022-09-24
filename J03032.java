
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class J03032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            String a[] = s.split("\\s+");
            for(String x : a){
                for (int j = x.length() - 1; j >= 0; j--) {
                    System.out.print(x.charAt(j));
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
