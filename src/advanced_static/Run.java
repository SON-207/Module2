package advanced_static;

public class Run {
    public static void main(String[] args) {
        System.out.println("--------Mo ta cau Hinh------");
        CauHinh.inCauHinh();
        System.out.println("Class long nhau");
        CauHinh.TienIch tienIch = new CauHinh.TienIch();
        tienIch.xinChao();
    }
}
