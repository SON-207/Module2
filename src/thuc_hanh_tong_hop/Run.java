package thuc_hanh_tong_hop;

public class Run {
    public static void main(String[] args) {
        HocSinh HS = new HocSinh();
        HS.setDiemToan(8.5);
        HS.setDiemVan(7.0);
        HS.hienThi();
        HS.setDiemVan(-3.0);
    }
}
