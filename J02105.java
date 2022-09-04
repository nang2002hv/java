
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class J02105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int a[][] = new int [n+1][n+1];
        for (int i = 1; i <= n; i++){
            for (int j = 1 ; j <= n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 1; i <= n; i++){
            System.out.format("List(%d) = ",i);
            for (int j = 1; j <= n; j++){
                if(a[i][j] == 1){
                    System.out.print(j +" ");
                }
            }
            System.out.println("");
        }
    }
}
