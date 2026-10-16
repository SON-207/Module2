package ss2_loop_and_array;
import java.util.Scanner;
public class btvn1_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("----------Danh Sach Sinh vien-------------" +
                    "\n1.IN HINH CHU NHAT" +
                    "\n2.IN HINH TAM GIAC VUONG " +
                    "\n3.IN TAM GIAC VUONG CAN" +
                    "\n4.THOAT" );
            System.out.println("----------Chon chuc nang--------------");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    for (int i = 0; i < 3; i++){
                        for(int j = 0; j < 8; j++){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 7; i++) {
                        for(int j = 1 ; j < i;j++){
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    for (int i = 1; i <= 7; i++) {
                        for(int j = 1 ; j <= (7-i)*2;j++){
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println("\n");
                    for(int i = 7; i >=1; i--){
                        for(int j = 1 ; j < i;j++){
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    for(int i = 7; i >=1; i--){
                        for(int j = 1 ; j <= (7-i)*2;j++){
                            System.out.print(" ");
                        }
                        for(int j = 1; j <=i ; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    int n = 5;
                    for (int i = 1; i <= n; i++) {
                        for(int j = 1; j <= n - i ;j++){
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                default:
                    flag = false;
            }
        }
        System.out.println("-----------ket thuc chuong trinh-----------------");
    }
}

