package ss4_class_object;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        System.out.println("---------chạy chương trình -----------");
        StudentManager studentManager= new StudentManager();
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
                    studentManager.showList();
                    break;
                case 2:
                    System.out.println("Them moi");
                    System.out.println("nhap id");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("nhap ten:");
                    String name = scanner.nextLine();
                    System.out.println("nhap dia chi");
                    String address = scanner.nextLine();
                    Student student = new Student(id,name,address);
                    studentManager.add(student);
                    break;
                case 3:
                    System.out.println("Xoa danh sach");
                    System.out.println("nhập id cần xóa:");
                    int deleteById = Integer.parseInt(scanner.nextLine());
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


