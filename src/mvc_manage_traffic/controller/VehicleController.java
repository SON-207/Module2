package mvc_manage_traffic.controller;

import mvc_manage_traffic.entity.*;
import mvc_manage_traffic.service.VehicleService;
import mvc_manage_traffic.view.VehicleView;

import java.util.List;

public class VehicleController {
    // Khởi tạo Service để giao tiếp với tầng dữ liệu
    private VehicleService vehicleService = new VehicleService();

    public void showMenu() {
        boolean flag = true;
        while (flag) {
            int choose = VehicleView.showMenu(); // Gọi View để hiển thị menu và lấy lựa chọn

            switch (choose) {
                case 1:
                    // Thêm mới phương tiện
                    int typeAdd = VehicleView.showVehicleTypeMenu();
                    String bienKS = VehicleView.inputBienKS();
                    String tenHSX = VehicleView.inputTenHSX();
                    int namSX = VehicleView.inputNamSX();
                    String chuSH = VehicleView.inputChuSH();

                    if (typeAdd == 1) {
                        double trongTai = VehicleView.inputTrongTai();
                        vehicleService.addTruck(bienKS, tenHSX, namSX, chuSH, trongTai);
                        VehicleView.displayMessage("Thêm xe tải thành công!");
                    } else if (typeAdd == 2) {
                        int soChoNgoi = VehicleView.inputSoChoNgoi();
                        String kieuXe = VehicleView.inputKieuXe();
                        vehicleService.addCar(bienKS, tenHSX, namSX, chuSH, soChoNgoi, kieuXe);
                        VehicleView.displayMessage("Thêm ô tô thành công!");
                    } else if (typeAdd == 3) {
                        double congSuat = VehicleView.inputCongSuat();
                        vehicleService.addMotorbike(bienKS, tenHSX, namSX, chuSH, congSuat);
                        VehicleView.displayMessage("Thêm xe máy thành công!");
                    } else {
                        VehicleView.displayMessage("Loại xe không hợp lệ!");
                    }
                    break;

                case 2:
                    // Hiển thị phương tiện
                    int typeShow = VehicleView.showVehicleTypeMenu();
                    if (typeShow == 1) {
                        List<Truck> list = vehicleService.getListTruck();
                        VehicleView.showTruckList(list);
                    } else if (typeShow == 2) {
                        List<Car> list = vehicleService.getListCar();
                        VehicleView.showCarList(list);
                    } else if (typeShow == 3) {
                        List<Motorbike> list = vehicleService.getListMotorbike();
                        VehicleView.showMotorbikeList(list);
                    } else {
                        VehicleView.displayMessage("Loại xe không hợp lệ!");
                    }
                    break;

                case 3:
                    // Xóa phương tiện
                    String bksDelete = VehicleView.inputBienKS();
                    Vehicle vehicle = vehicleService.searchByBienKS(bksDelete);

                    if (vehicle != null) {
                        boolean isConfirm = VehicleView.confirmDelete();
                        if (isConfirm) {
                            vehicleService.deleteVehicle(bksDelete);
                            VehicleView.displayMessage("Đã xóa thành công!");
                        } else {
                            VehicleView.displayMessage("Đã hủy thao tác xóa.");
                        }
                    } else {
                        VehicleView.displayMessage("Không tìm thấy biển kiểm soát này trong hệ thống!");
                    }
                    break;

                case 4:
                    flag = false;
                    break;

                default:
                    VehicleView.displayMessage("Lựa chọn không hợp lệ, vui lòng chọn lại từ 1 đến 4!");
            }
        }
        VehicleView.displayMessage("------ Kết thúc chương trình -----------");
    }
}