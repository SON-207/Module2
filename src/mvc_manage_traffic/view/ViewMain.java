package mvc_manage_traffic.view;

import mvc_manage_traffic.controller.VehicleController;

public class ViewMain {
    public static void main(String[] args) {
        // Khởi tạo Controller để bắt đầu điều phối chương trình
        VehicleController controller = new VehicleController();

        // Gọi menu từ controller
        controller.showMenu();
    }
}