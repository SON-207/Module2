package trainning_object_class_cons;
import java.io.*;
public class Run {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("Son", 19 , 9.0);
        SinhVien sv2 = new SinhVien("Sam", 30 , 5.0);
        sv1.hienThi();
        System.out.println("Xep Loai: " +sv1.danhSach());
        sv2.hienThi();
        System.out.println("Xep Loai: " +sv2.danhSach());
    }
}
