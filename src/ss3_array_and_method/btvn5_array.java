package ss3_array_and_method;
import java.util.Scanner;
public class btvn5_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n tu ban phim = ");
        int n = scanner.nextInt();
        int[] N = new int[n];
        //nhap ptu
        for (int i = 0; i < N.length; i++) {
            System.out.println("N ["+i+"] = ");
            N[i] = scanner.nextInt();
        }
        //in mang vua nhap
        System.out.println("mang vua nhap la");
        for (int i = 0; i < N.length; i++) {
            System.out.print(N[i]+" ");
        }
        //kiem tra gia tri nho nhat
        int min = N[0];
        for (int i = 1; i < N.length; i++) {
            if(min > N[i]){
                min = N[i];
            }
        }
        System.out.println("gia tri nho nhat la " +min);
    }
}
