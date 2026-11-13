package mvc_manage_traffic.view;

import mvc_manage_traffic.entity.*;
import java.util.List;
import java.util.Scanner;

public class VehicleView {
    private static Scanner scanner = new Scanner(System.in);

    // Hiển thị menu chính
    public static int showMenu() {
        System.out.println("\n===== CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN =====");
        System.out.println("1. Thêm mới phương tiện");
        System.out.println("2. Hiển thị phương tiện");
        System.out.println("3. Xoá phương tiện");
        System.out.println("4. Thoát");
        System.out.print("------- Chọn chức năng -------: ");
        return Integer.parseInt(scanner.nextLine());
    }

    // Menu chọn loại xe
    public static int showVehicleTypeMenu() {
        System.out.println("\n--- CHỌN LOẠI XE ---");
        System.out.println("1. Xe tải (Truck)");
        System.out.println("2. Ô tô (Car)");
        System.out.println("3. Xe máy (Motorbike)");
        System.out.print("Chọn loại xe: ");
        return Integer.parseInt(scanner.nextLine());
    }

    // Các hàm nhập dữ liệu chung
    public static String inputBienKS() {
        System.out.print("Nhập biển kiểm soát: ");
        return scanner.nextLine();
    }

    public static String inputTenHSX() {
        System.out.print("Nhập tên hãng sản xuất: ");
        return scanner.nextLine();
    }

    public static int inputNamSX() {
        System.out.print("Nhập năm sản xuất: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static String inputChuSH() {
        System.out.print("Nhập tên chủ sở hữu: ");
        return scanner.nextLine();
    }

    // Các hàm nhập dữ liệu riêng
    public static double inputTrongTai() {
        System.out.print("Nhập trọng tải (tấn): ");
        return Double.parseDouble(scanner.nextLine());
    }

    public static int inputSoChoNgoi() {
        System.out.print("Nhập số chỗ ngồi: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static String inputKieuXe() {
        System.out.print("Nhập kiểu xe (Du lịch / Xe khách): ");
        return scanner.nextLine();
    }

    public static double inputCongSuat() {
        System.out.print("Nhập công suất: ");
        return Double.parseDouble(scanner.nextLine());
    }

    // Hàm hiển thị danh sách phương tiện
    public static void showTruckList(List<Truck> list) {
        System.out.println("\n--- DANH SÁCH XE TẢI ---");
        if (list.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        for (Truck t : list) {
            t.displayInfo();
        }
    }

    public static void showCarList(List<Car> list) {
        System.out.println("\n--- DANH SÁCH Ô TÔ ---");
        if (list.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        for (Car c : list) {
            c.displayInfo();
        }
    }

    public static void showMotorbikeList(List<Motorbike> list) {
        System.out.println("\n--- DANH SÁCH XE MÁY ---");
        if (list.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        for (Motorbike m : list) {
            m.displayInfo();
        }
    }

    // Xác nhận xóa (Yes/No)
    public static boolean confirmDelete() {
        System.out.print("Tìm thấy biển kiểm soát! Bạn có chắc chắn muốn xóa không? (Y/N): ");
        String confirm = scanner.nextLine();
        return confirm.equalsIgnoreCase("Y") || confirm.equalsIgnoreCase("Yes");
    }

    public static void displayMessage(String message) {
        System.out.println(message);
    }
}