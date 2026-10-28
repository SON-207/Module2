package trainning2_object_class_cons;

public class SinhVien {
    private String ten;
    private int tuoi;
    private double diemTB;

    public SinhVien() {
        this("chua co ten", 0);
    }

    SinhVien(String ten, int tuoi) {
        this(ten, tuoi, 0);
    }

    SinhVien(String ten, int tuoi, double diemTB) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diemTB = diemTB;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemtb) {
        if (diemtb >= 0 && diemtb <= 10) {
            this.diemTB = diemTB;
        } else {
            System.out.println("diem tb ko hop le");
        }
    }

    public void hienThi() {
        System.out.println("Ten: " + ten + " Tuoi: " + tuoi + " Diem Trung Binh: " + diemTB);

    }
}