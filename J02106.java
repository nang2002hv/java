
import java.util.Arrays;
import java.util.Scanner;


public class J02106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int a[][] = new int [n+1][3+1];
        Arrays.fill(a, 0);
        for (int i = 1; i <= n; i++){
            for (int j = 1 ; j <= 3; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int dem = 0;
      
        for (int i = 1; i <= n; i++){
            int tmp = 0, res = 0;
            for (int j = 1 ; j <= 3; j++){
                if(a[i][j] == 1){
                    tmp++;
                } else res++;
            }
            if(tmp > res) dem++;
        }        
        System.out.println(dem);
    }
}
