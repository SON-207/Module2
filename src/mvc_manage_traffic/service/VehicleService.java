package mvc_manage_traffic.service;

import mvc_manage_traffic.entity.*;
import mvc_manage_traffic.repository.IVehicleRepository;
import mvc_manage_traffic.repository.VehicleRepository;
import java.util.List;

public class VehicleService {
    // Khai báo bằng Interface (tính đa hình)
    private VehicleRepository repository;

    public VehicleService() {
        // Khởi tạo thực thể cụ thể (Implementation)
        this.repository = new VehicleRepository();
    }

    public List<String> getHangSanXuatList() {
        return repository.getHangSanXuatList();
    }

    public void addTruck(String bienKS, String tenHSX, int namSX, String chuSH, double trongTai) {
        Truck truck = new Truck(bienKS, tenHSX, namSX, chuSH, trongTai);
        repository.addTruck(truck);
    }

    public void addCar(String bienKS, String tenHSX, int namSX, String chuSH, int soChoNgoi, String kieuXe) {
        Car car = new Car(bienKS, tenHSX, namSX, chuSH, soChoNgoi, kieuXe);
        repository.addCar(car);
    }

    public void addMotorbike(String bienKS, String tenHSX, int namSX, String chuSH, double congSuat) {
        Motorbike motorbike = new Motorbike(bienKS, tenHSX, namSX, chuSH, congSuat);
        repository.addMotorbike(motorbike);
    }

    public List<Truck> getListTruck() {
        return repository.getXeTaiList();
    }

    public List<Car> getListCar() {
        return repository.getOtoList();
    }

    public List<Motorbike> getListMotorbike() {
        return repository.getXeMayList();
    }

    public Vehicle searchByBienKS(String bienKS) {
        return repository.findByBienKS(bienKS);
    }

    public boolean deleteVehicle(String bienKS) {
        return repository.deleteByBienKS(bienKS);
    }
}