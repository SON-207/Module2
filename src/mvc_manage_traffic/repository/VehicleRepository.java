package mvc_manage_traffic.repository;

import mvc_manage_traffic.entity.*;
import java.util.ArrayList;
import java.util.List;

public class VehicleRepository implements IVehicleRepository {
    private List<Truck> xeTaiList = new ArrayList<>();
    private List<Car> otoList = new ArrayList<>();
    private List<Motorbike> xeMayList = new ArrayList<>();
    private List<String> hangSanXuatList = new ArrayList<>();

    public VehicleRepository() {
        // Dữ liệu mẫu hãng sản xuất
        hangSanXuatList.add("Yamaha");
        hangSanXuatList.add("Honda");
        hangSanXuatList.add("Dongfeng");
        hangSanXuatList.add("Huyndai");
        hangSanXuatList.add("Ford");
        hangSanXuatList.add("Toyota");
        hangSanXuatList.add("Hino");
    }

    @Override
    public void addTruck(Truck truck) {
        xeTaiList.add(truck);
    }

    @Override
    public void addCar(Car car) {
        otoList.add(car);
    }

    @Override
    public void addMotorbike(Motorbike motorbike) {
        xeMayList.add(motorbike);
    }

    @Override
    public List<Truck> getXeTaiList() {
        return xeTaiList;
    }

    @Override
    public List<Car> getOtoList() {
        return otoList;
    }

    @Override
    public List<Motorbike> getXeMayList() {
        return xeMayList;
    }

    @Override
    public List<String> getHangSanXuatList() {
        return hangSanXuatList;
    }

    @Override
    public Vehicle findByBienKS(String bienKS) {
        for (Truck t : xeTaiList) {
            if (t.getBienKS().equalsIgnoreCase(bienKS)) return t;
        }
        for (Car c : otoList) {
            if (c.getBienKS().equalsIgnoreCase(bienKS)) return c;
        }
        for (Motorbike m : xeMayList) {
            if (m.getBienKS().equalsIgnoreCase(bienKS)) return m;
        }
        return null;
    }


    @Override
    public boolean deleteByBienKS(String bienKS) {
        boolean removed = xeTaiList.removeIf(t -> t.getBienKS().equalsIgnoreCase(bienKS));
        if (removed) return true;

        removed = otoList.removeIf(c -> c.getBienKS().equalsIgnoreCase(bienKS));
        if (removed) return true;

        return xeMayList.removeIf(m -> m.getBienKS().equalsIgnoreCase(bienKS));
    }
}