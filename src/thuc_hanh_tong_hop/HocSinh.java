package thuc_hanh_tong_hop;

public class HocSinh {
    private String maHS;
    private String hoTen;
    private double diemToan;
    private double diemVan;

    public HocSinh() {
        this("Chua co", "chua co", 0, 0);
    }

    public HocSinh(String maHS, String hoTen, double diemToan, double diemVan) {
        this.maHS = maHS;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
    }

    public String getMaHS() {
        return maHS;
    }

    public void setMaHS(String maHS) {
        this.maHS = maHS;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        if (diemToan >= 0 && diemToan <= 10) {
            this.diemToan = diemToan;
        } else {
            System.out.println("Diem khong hop le");
        }
    }

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        if (diemVan >= 0 && diemVan <= 10) {
            this.diemVan = diemVan;
        } else {
            System.out.println("Diem khong hop le");
        }
    }

    public double tinhDiemTrungBinh() {
        return (diemToan + diemVan) / 2;
    }

    public void hienThi() {
        System.out.println("Ma Hoc Sinh: " + maHS + " Ten Hoc Sinh: " + hoTen + " Diem Trung Binh: " + tinhDiemTrungBinh());
    }
}



