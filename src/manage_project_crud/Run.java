package manage_project_crud;

import manage_project_crud.Product;
import manage_project_crud.Manage;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        System.out.println("---------chạy chương trình -----------");
        Manage productManager= new Manage();
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
                    productManager.showList();
                    break;
                case 2:
                    System.out.println("Them moi");
                    System.out.println("nhap id");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("nhap ten:");
                    String name = scanner.nextLine();
                    System.out.println("nhap gia tien");
                    int price = Integer.parseInt(scanner.nextLine());
                    Product pr = new Product(id,name,price);
                    productManager.add(pr);
                    break;
                case 3:
                    System.out.println("Xoa danh sach");
                    System.out.println("nhập id cần xóa:");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    productManager.deleteByID(deleteId);
                    boolean ok = productManager.deleteByID(deleteId);
                    if(ok){
                        System.out.println("-------xoa thanh cong----");
                    }else{
                        System.out.println("--------khong tim thay ID------");
                    }
                    break;
                case 4:
                    System.out.println("Tim kiem");
                    System.out.println("nhap ID tim kiem:");
                    int findId = Integer.parseInt(scanner.nextLine());
                    Product tim = productManager.find(findId);
                    if (tim != null ){
                        System.out.println("-----Da tim thay mang----:");
                        System.out.println(tim.hienThi());
                    }else{
                        System.out.println("------Khong tim thay mang--------");
                    }
                    break;
                default:
                    flag = false;
            }
        }
        System.out.println("-----------ket thuc chuong trinh-----------------");
    }
}
