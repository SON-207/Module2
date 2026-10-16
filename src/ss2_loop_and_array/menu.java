package ss2_loop_and_array;
import java.util.Scanner;
public class menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("----------Danh Sach Sinh vien-------------" +
                    "\n1.Hien thi danh sach" +
                    "\n2.Them moi" +
                    "\n3.Xoa" +
                    "\n4.Tim kiem" +
                    "\n5.Thoat");
            System.out.println("----------Chon chuc nang--------------");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    System.out.println("hien thi ");
                    break;
                case 2:
                    System.out.println("Them moi");
                    break;
                case 3:
                    System.out.println("Xoa danh sach");
                    break;
                case 4:
                    System.out.println("Tim kiem");
                    break;
                default:
                    flag = false;
            }
        }
        System.out.println("-----------ket thuc chuong trinh-----------------");
    }
}