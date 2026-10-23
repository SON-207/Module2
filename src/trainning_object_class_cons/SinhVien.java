package trainning_object_class_cons;

public class SinhVien {
    String ten;
    int tuoi;
    double diemtb;

    SinhVien(String ten, int tuoi, double diemtb) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diemtb = diemtb;
    }
    void hienThi(){
        System.out.println("Ten: " +ten +" Tuoi: " +tuoi +" Diem Trung Binh: " +diemtb);
    }
    String danhSach(){
        if(diemtb >= 8) return "Gioi";
        if(diemtb >=6.5) return "Kha";
        if(diemtb >=5) return "Trung Binh";
        return "Yeu";
    }
}




