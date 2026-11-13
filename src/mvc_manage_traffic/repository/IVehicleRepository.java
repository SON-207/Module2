package mvc_manage_traffic.repository;

import mvc_manage_traffic.entity.*;
import java.util.List;

public interface IVehicleRepository {
    void addTruck(Truck truck);
    void addCar(Car car);
    void addMotorbike(Motorbike motorbike);

    List<Truck> getXeTaiList();
    List<Car> getOtoList();
    List<Motorbike> getXeMayList();
    List<String> getHangSanXuatList();

    Vehicle findByBienKS(String bienKS);
    boolean deleteByBienKS(String bienKS);
}