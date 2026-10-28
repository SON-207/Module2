package training_ke_thua;

public class NhanVien {
    protected String ten;
    protected double luong;

    public NhanVien(String ten, double luong) {
        this.ten = ten;
        this.luong = luong;
    }

    public void hienthi() {
        System.out.println("Ho va Ten: " + ten + "So luong: " + luong);
    }
}


