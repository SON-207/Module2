package first_time_training_static;

public class Run {
    public static void main(String[] args) {
        HocSinh hs1 = new HocSinh("An");
        HocSinh hs2 = new HocSinh("Binh");
        HocSinh hs3 = new HocSinh("Cuong");
        hs1.hienThi();
        hs2.hienThi();
        hs3.hienThi();
        System.out.println("tong so hoc sinh: " +HocSinh.tongHocSinh);


    }
}
