package ss2_loop_and_array;
import java.util.Scanner;
public class btvn2_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi nhap number = ");
        int numbers = scanner.nextInt();
        System.out.println("hien thi " + numbers + " so nguyen to dau tien");
        int count = 0;
        int N = 2;
        while (count < numbers) {
            boolean tam = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    tam = false;
                    break;
                }
            }
                if (tam) {
                    count++;
                    System.out.println("so " + N + " la so nguyen to");
                }
                N++;
            }
        }
    }


