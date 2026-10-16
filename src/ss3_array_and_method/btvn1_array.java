package ss3_array_and_method;
import java.util.Scanner;

public class btvn1_array {
    public static void main(String[] args) {
        int[] N = {10,4,6,7,8,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap X = ");
        int x = sc.nextInt();
        System.out.println("X = "+x+" la phan tu can xoa");
        // chi ra x nam o vi tri index
        int index = 0;
        for (int i = 0; i <= N.length-1; i++) {
            if (x == N[i]) {
                index = i;
                System.out.println("X nam o vi tri thu " +i +" trong mang");
                break;
            }
        }

        for (int i = index; i < N.length-1 ; i++) {
            N[i] = N[i+1];
        }

        N[N.length-1] = 0;
        System.out.println("new array = ");
        for (int i = 0; i < N.length; i++) {
            System.out.print(N[i] + " ");
        }


    }
}
