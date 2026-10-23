package trainning2_object_class_cons;

public class RunTn2 {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        sv1.getTen();
        sv1.getTuoi();
        sv1.getDiemTB();
        sv1.hienThi();
        SinhVien sv2 = new SinhVien("Son", 19);
        sv2.getTen();
        sv2.getTuoi();
        sv2.getDiemTB();
        sv2.hienThi();
        SinhVien sv3 = new SinhVien("An", 23, 5.5);
        sv3.getTen();
        sv3.getTuoi();
        sv3.getDiemTB();
        sv3.hienThi();
        sv3.setDiemTB(-1);
    }
}
